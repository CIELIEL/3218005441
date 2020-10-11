package Test;

import Bean.CreatSubjects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreatSubjectsTest {


    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void creatSubject_10000() {
        CreatSubjects creatSubjects=new CreatSubjects();
        creatSubjects.creatSubject(10000,1);
    }
    @Test
    public void creatSubjectAnswer_10000() {
        CreatSubjects creatSubjects=new CreatSubjects();
        creatSubjects.creatSubject(10000,2);
    }
    @Test
    public void creatSubject_100() {
        CreatSubjects creatSubjects=new CreatSubjects();
        creatSubjects.creatSubject(100,1);
    }

    @Test
    public void creatSubjectAnswer_100() {
        CreatSubjects creatSubjects=new CreatSubjects();
        creatSubjects.creatSubject(100,2);
    }


}