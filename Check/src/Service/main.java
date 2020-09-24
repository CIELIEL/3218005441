package Service;

import Service.CheckSimilarity;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        File file1=new File(args[0]);//原文本
        File file2=new File(args[1]);//抄袭文本
        File file3=new File(args[2]);//结果输出文本


        CheckSimilarity c=new CheckSimilarity();
        c.checkSimilarity(file1,file2,file3);

        /*CheckSimilarity c2=new CheckSimilarity();
        c2.checkSimilarity(fileOrig_8_add,fileOrig_8_del,file2);

        CheckSimilarity c3=new CheckSimilarity();
        c3.checkSimilarity(fileOrig_8_del,fileOrig_8_dis_1,file3);

        CheckSimilarity c4=new CheckSimilarity();
        c4.checkSimilarity(fileOrig_8_dis_1,fileOrig_8_dis_10,file4);

        CheckSimilarity c5=new CheckSimilarity();
        c5.checkSimilarity(fileOrig_8_dis_10,fileOrig_8_dis_15,file5);

*/
    }
}
