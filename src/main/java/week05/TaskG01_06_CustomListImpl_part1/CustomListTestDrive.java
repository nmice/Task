package week05.TaskG01_06_CustomListImpl_part1;

import java.util.ArrayList;
import java.util.List;

public class CustomListTestDrive {



    public static void main(String[] args) {
//        CustomBeautyList list = null;
        CustomBeautyList customList = new CustomListImpl();
        try {
            customList.add(null);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("The error is handled");
        }

        List<String> list = new ArrayList<>();

        List list1 = new ArrayList();
        System.out.println("the list is empty now:" + list);
        list.add("first");
        System.out.println("add() method adds new value to the list. Now the list is :" + list);

        list.add(0, "second");//
        System.out.println("add() method adds new value to the list and puts the i-th element. Now the list is :" + list);

        list.set(0, "secondary");
        System.out.println("set() method sets new value of the i-th element :" + list);

        System.out.println("size() method gets the size of list :" + list.size());

        System.out.println("get() method gets the i-th element :" + list.get(1));

        System.out.println("indexOf() method gets the number of selected element :" + list.indexOf("first"));

        System.out.println("contains() method checks the contents of the object in the list:" + list.contains("three"));

        list.remove(1);
        System.out.println("remove() method removes the selected item. Now the list is :" + list);

        list.remove("secondary");
        System.out.println("remove() method removes the selected object. Now the list is :" + list);
    }
}
