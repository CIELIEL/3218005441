package Test;

import Bean.BinaryTree;
import Bean.TreeNode;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void getResult_1() {
        BinaryTree binaryTree=new BinaryTree(3);//3个运算符
        binaryTree.createBTree();
        TreeNode treeNode=binaryTree.getRoot();
        String s=treeNode.getResult(binaryTree.getOpeList());
        System.out.println(binaryTree.getRoot().toString()+"="+s);
    }

    @Test
    public void getResult_2() {
        BinaryTree binaryTree=new BinaryTree(2);//3个运算符
        binaryTree.createBTree();
        TreeNode treeNode=binaryTree.getRoot();
        String s=treeNode.getResult(binaryTree.getOpeList());
        System.out.println(binaryTree.getRoot().toString()+"="+s);
    }
}