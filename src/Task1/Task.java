package Task1;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        System.out.println(likes(list1));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Peter");
        System.out.println(likes(list2));

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Jacob");
        list3.add("Alex");
        System.out.println(likes(list3));

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Max");
        list4.add("John");
        list4.add("Mark");
        System.out.println(likes(list4));

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Alex");
        list5.add("Jacob");
        list5.add("Mark");
        list5.add("Max");
        System.out.println(likes(list5));
    }

    public static String likes(ArrayList<String> list) {
        String text = "";
        int length = list.size();

        if(length == 0)
            text = "no one likes this";
        else if(length == 1)
            text = list.get(0) + " likes this";
        else if(length == 2)
            text = list.get(0) + " and " + list.get(1) + " like this";
        else if(length == 3)
            text = list.get(0) + ", " + list.get(1) + " and " + list.get(2) + " like this";
        else
            text = list.get(0) + ", " + list.get(1) + " and " + (length - 2) + " others like this";
       
        return text;
    }
}
