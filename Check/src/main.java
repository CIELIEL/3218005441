import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        File fileOrig=new File("src/orig.txt");
        File fileOrig_8_add=new File("src/orig_0.8_add.txt");
        File fileOrig_8_del=new File("src/orig_0.8_del.txt");
        File fileOrig_8_dis_1=new File("src/orig_0.8_dis_1.txt");
        File fileOrig_8_dis_10=new File("src/orig_0.8_dis_10.txt");
        File fileOrig_8_dis_15=new File("src/orig_0.8_dis_15.txt");
        File file1=new File("src/result12.txt");
        File file2=new File("src/result23.txt");
        File file3=new File("src/result34.txt");
        File file4=new File("src/result45.txt");
        File file5=new File("src/result56.txt");


        CheckSimilarity c1=new CheckSimilarity();
        c1.checkSimilarity(fileOrig,fileOrig_8_add,file1);

        CheckSimilarity c2=new CheckSimilarity();
        c2.checkSimilarity(fileOrig_8_add,fileOrig_8_del,file2);

        CheckSimilarity c3=new CheckSimilarity();
        c3.checkSimilarity(fileOrig_8_del,fileOrig_8_dis_1,file3);

        CheckSimilarity c4=new CheckSimilarity();
        c4.checkSimilarity(fileOrig_8_dis_1,fileOrig_8_dis_10,file4);

        CheckSimilarity c5=new CheckSimilarity();
        c5.checkSimilarity(fileOrig_8_dis_10,fileOrig_8_dis_15,file5);








    }
}
