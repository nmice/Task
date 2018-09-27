package week12.binarysearchtree;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BinarySTreeTestDrive {

    public static void main(String[] args) {
        Set<String> myBinaryTree = new TreeSet<>(); //new TreeSet<>()   BinarySearchTreeOwn
        for (Iterator<String> iterator = myBinaryTree.iterator(); iterator.hasNext(); ) {
            String elem = iterator.next();
            System.out.println(elem);
        }
      System.out.println(myBinaryTree);
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added cFIRST - " + myBinaryTree.add("cfirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added aFIRST - " + myBinaryTree.add("afirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added bFIRST - " + myBinaryTree.add("bfirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added FIRST - " + myBinaryTree.add("first"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added aSECOND - " + myBinaryTree.add("asecond"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added SECOND - " + myBinaryTree.add("second"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Added THIRD - " + myBinaryTree.add("third"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println(Arrays.toString(myBinaryTree.toArray()));


        System.out.println(myBinaryTree);
        System.out.println("Remove THIRD - " + myBinaryTree.remove("third"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove FIRST - " + myBinaryTree.remove("first"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove SECOND - " + myBinaryTree.remove("second"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove aaSECOND - " + myBinaryTree.remove("aasecond"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove aaSECOND - " + myBinaryTree.remove("cfirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove aaSECOND - " + myBinaryTree.remove("afirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove aaSECOND - " + myBinaryTree.remove("bfirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());
        System.out.println("Remove aaSECOND - " + myBinaryTree.remove("bfirst"));
        System.out.println("Size of myBinaryTree - " + myBinaryTree.size());






    }

}
