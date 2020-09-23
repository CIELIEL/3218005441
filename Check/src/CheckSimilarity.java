import java.io.*;

public class CheckSimilarity{


    public String checkSimilarity(File file1, File file2,File file3)throws IOException {

        System.out.println("原文件的绝对路径：" + file1.getAbsolutePath());
        System.out.println("抄袭版文件的绝对路径：" + file2.getAbsolutePath());
        System.out.println("查重结果文件的绝对路径：" + file3.getAbsolutePath());
        BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedReader f2 = new BufferedReader(new InputStreamReader(new  FileInputStream(file2)));
        String  Str;
        StringBuilder Str1 = new StringBuilder();
        StringBuilder Str2 = new StringBuilder();
        while((Str = f1.readLine()) != null){//将文本转化为String
            Str1.append(Str).append("\r\n");
        }
        while ((Str = f2.readLine())!=null){
            Str2.append(Str).append("\r\n");
        }

        GetSimilarity getSimilarity=new GetSimilarity();
        double gS=getSimilarity.getSimilarity(Str1.toString(),Str2.toString());
        double gS1=gS*100;
        System.out.println(String.format("%.2f",gS1)+"%");
        try (FileWriter writer = new FileWriter(file3)) {
            writer.write(String.format("%.2f",gS1)+"%");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.format("%.2f",gS1)+"%";
    }

}
