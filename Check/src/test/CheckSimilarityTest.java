package test;

import Service.CheckSimilarity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class CheckSimilarityTest {


    @Before
    public void setUp() throws Exception {
        System.out.println("CheckSimilarityTest测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("CheckSimilarityTest测试结束");
    }
    /**
     * 测试 文本为空
     * src/empty.txt
     */
    @Test
    public void checkSimilarity_Empty() {
        CheckSimilarity c1=new CheckSimilarity();
        try {
            c1.checkSimilarity(new File("src/empty.txt"),new File("src/orig.txt"),new File("src/result_empty"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败，文本为空");
            Assert.fail();
        }
    }


    /**
     * 测试 输入文本路径不存在或错误
     * rc/orig_non_existent.txt
     */
    @Test
    public void checkSimilarity_Non_Existent() {
        CheckSimilarity c2=new CheckSimilarity();
        try {
            c2.checkSimilarity(new File("src/orig_non_existent.txt"),new File("src/orig.txt"),new File("src/result_non_existent"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败，文本路径不存在");
            Assert.fail();
        }
    }

    /**
     * 测试 输入的两个查重文本为相同文本
     * orig.txt
     */
    @Test
    public void checkSimilarity_Same(){
        CheckSimilarity c3=new CheckSimilarity();
        try {
            c3.checkSimilarity(new File("src/orig.txt"),new File("src/orig.txt"),new File("src/result_same"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }

    /**
     * 测试
     * orig.txt和orig_0.8_add.txt(添加)
     */
    @Test
    public void checkSimilarity_Add(){
        CheckSimilarity c4=new CheckSimilarity();
        try {
            c4.checkSimilarity(new File("src/orig.txt"),new File("src/orig_0.8_add.txt"),new File("src/result_add"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }

    /**
     * 测试
     * orig.txt和orig_0.8_del.txt(删减)
     */
    @Test
    public void checkSimilarity_Delete(){
        CheckSimilarity c5=new CheckSimilarity();
        try {
            c5.checkSimilarity(new File("src/orig.txt"),new File("src/orig_0.8_del.txt"),new File("src/result_delete"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }


    /**
     * 测试
     * orig.txt和orig_0.8_dis_1.txt
     */
    @Test
    public void checkSimilarity_dis_1(){
        CheckSimilarity c6=new CheckSimilarity();
        try {
            c6.checkSimilarity(new File("src/orig.txt"),new File("src/orig_0.8_dis_1.txt"),new File("src/result_dis_1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }


    /**
     * 测试
     * orig.txt和orig_0.8_dis_10.txt
     */
    @Test
    public void checkSimilarity_dis_10(){
        CheckSimilarity c6=new CheckSimilarity();
        try {
            c6.checkSimilarity(new File("src/orig.txt"),new File("src/orig_0.8_dis_10.txt"),new File("src/result_dis_10"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }


    /**
     * 测试
     * orig.txt和orig_0.8_dis_15.txt
     */
    @Test
    public void checkSimilarity_dis_15(){
        CheckSimilarity c7=new CheckSimilarity();
        try {
            c7.checkSimilarity(new File("src/orig.txt"),new File("src/orig_0.8_dis_15.txt"),new File("src/result_dis_15"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }


    /**
     * 测试
     * orig_0.8_add.txt和orig_0.8_del.txt
     */
    @Test
    public void checkSimilarity_dis_add_del(){
        CheckSimilarity c8=new CheckSimilarity();
        try {
            c8.checkSimilarity(new File("src/orig_0.8_add.txt"),new File("src/orig_0.8_del.txt"),new File("src/result_add_del"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }


    /**
     * 测试
     * orig_0.8_dis_1.txt和orig_0.8_dis_15.txt
     */
    @Test
    public void checkSimilarity_dis_1_15(){
        CheckSimilarity c9=new CheckSimilarity();
        try {
            c9.checkSimilarity(new File("src/orig_0.8_dis_1.txt"),new File("src/orig_0.8_dis_15.txt"),new File("src/result_dis_1_15"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }



    /**
     * 测试
     * orig_0.8_add.txt和orig_0.8_dis_1.txt
     */
    @Test
    public void checkSimilarity_dis_add_dis_1(){
        CheckSimilarity c10=new CheckSimilarity();
        try {
            c10.checkSimilarity(new File("src/orig_0.8_add.txt"),new File("src/orig_0.8_dis_1.txt"),new File("src/result_dis_add_dis"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("测试失败");
            Assert.fail();
        }
    }






}