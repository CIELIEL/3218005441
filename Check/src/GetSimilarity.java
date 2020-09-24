import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetSimilarity {
    public double getSimilarity(String Str1,String Str2){
        int Length1 = Str1.length();
        int Length2 = Str2.length();//编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符
        int editDistance = getEditDistance(Str1,Str2,Length1,Length2);//获得最小编辑距离
        double s=1-1.0*editDistance/Math.max(Length1,Length2);//求得相似度
        return  s;


}
    private static int getEditDistance(String str1, String str2, int L1, int L2){//动态规划求最小编辑距离
        int Distance=0;
        int editDistance = 0;
        if(L1!=0&&L2!=0){
            int[][] DistanceList=new int[L1+1][L2+1];
            //编号
            int number=0;
            for (int i = 0; i <= L1; i++) {//初始化，给每个字符编号
                DistanceList[i][0]=number;
                number++;
            }
            number=0;
            for (int i = 0; i <=L2; i++) {
                DistanceList[0][i]=number;
                number++;
            }

            char[] Str1_CharArray=str1.toCharArray();
            char[] Str2_CharArray=str2.toCharArray();
            for (int i = 1; i <= L1; i++) {
                for(int j=1;j<=L2;j++){
                    if(Str1_CharArray[i-1]==Str2_CharArray[j-1]){
                        Distance=0;
                    }
                    else{
                        Distance=1;
                    }
                    int Temp1=DistanceList[i-1][j]+1;//增
                    int Temp2=DistanceList[i][j-1]+1;//减
                    int Temp3=DistanceList[i-1][j-1]+Distance;//改

                    DistanceList[i][j]=Math.min(Temp1,Temp2);//找最小的一步
                    DistanceList[i][j]=Math.min(Temp3,DistanceList[i][j]);

                }

            }

            editDistance=DistanceList[L1][L2];
        }
        return editDistance;
    }
    /*private Map<Character, int[]> vectorMap = new HashMap<Character, int[]>();
    private int[] tempArray = null;

    public  GetSimilarity(String S1, String S2) {
        for (Character character1 : S1.toCharArray()) {

            if (vectorMap.containsKey(character1)) {

                vectorMap.get(character1)[0]++;

            } else {

                tempArray = new int[2];

                tempArray[0] = 1;

                tempArray[1] = 0;

                vectorMap.put(character1, tempArray);

            }

        }

        for (Character character2 : S2.toCharArray()) {

            if (vectorMap.containsKey(character2)) {

                vectorMap.get(character2)[1]++;

            } else {

                tempArray = new int[2];

                tempArray[0] = 0;

                tempArray[1] = 1;

                vectorMap.put(character2, tempArray);

            }
        }
    }
            public double sim() {

                double result = 0;

                result = pointMulti(vectorMap) / sqrtMulti(vectorMap);

                return result;

            }



            private double sqrtMulti(Map<Character, int[]> paramMap) {

                double result = 0;

                result = squares(paramMap);

                result = Math.sqrt(result);

                return result;

            }



            // 求平方和

            private double squares(Map<Character, int[]> paramMap) {

                double result1 = 0;

                double result2 = 0;

                Set<Character> keySet = paramMap.keySet();

                for (Character character : keySet) {

                    int temp[] = paramMap.get(character);

                    result1 += (temp[0] * temp[0]);

                    result2 += (temp[1] * temp[1]);

                }

                return result1 * result2;

            }



            // 点乘法

            private double pointMulti(Map<Character, int[]> paramMap) {

                double result = 0;

                Set<Character> keySet = paramMap.keySet();

                for (Character character : keySet) {

                    int temp[] = paramMap.get(character);

                    result += (temp[0] * temp[1]);

                }

                return result;

            }

        /*Map<Character, int[]> map = new HashMap<>();//将两个字符串中的中文字符以及出现的总数封装到map中；
        for (int i = 0; i < S1.length()-2; i++) //删除空格
        {
            char d1 = S1.charAt(i); //  d1=第i个汉字，标点不比较
            if(isChinese(d1)) {
                int[] num = map.get(d1);
                if (num != null && num.length == 2) {
                    num[0]++; //已有该字符，加1,原文的字符数量提取
                } else {
                    num = new int[2];
                    num[0] = 1;//原文
                    map.put(d1, num);
                }
            }
        }
        for (int i = 1; i < S2.length()-2; i++) {//删除空格
            char d2 = S2.charAt(i);
            if(isChinese(d2)) {
                int[] num = map.get(d2);
                if (num != null && num.length == 2) {
                    num[1]++;
                } else {
                    num = new int[2];
                    //num[0] = 0;
                    num[1] = 1;
                    map.put(d2, num);
                }
               // System.out.println(d2 + Arrays.toString(num));
            }
        }
        double a1 = 0;
        double a2 = 0;
        double denominator = 0;
        for (Map.Entry entry : map.entrySet())
        {
            int[] c = (int[]) entry.getValue();
            denominator += c[0] * c[1];
            a1 += c[0] * c[0];
            a2 += c[1] * c[1];
        }
        return denominator / (Math.sqrt(a1) * Math.sqrt(a2));//余弦定理
    }
    private static boolean isChinese(char ch) {
        // 判断是否汉字
        return (ch >= 0x4E00 && ch <= 0x9FA5);
    }*/

}
