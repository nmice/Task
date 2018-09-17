package week12.binarysearchtree;

import java.util.Set;
import java.util.TreeSet;

public class BinarySTreeTestDrive {

    public static void main(String[] args) {
        Set<String> myBinaryTree = new TreeSet<>();
        System.out.println(myBinaryTree);
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added FIRST - " + myBinaryTree.add("first"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added SECOND - " + myBinaryTree.add("second"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added THIRD - " + myBinaryTree.add("third"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println(myBinaryTree);
    }

}
