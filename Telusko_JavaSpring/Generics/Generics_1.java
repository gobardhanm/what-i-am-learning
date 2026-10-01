package Generics;

import java.util.ArrayList;

class Generics_1{
    public static void main(String[] args) {
        
        // Typesafety - which stores only similar kind of data
        String names[] = new String[5];

        names[0] = "Abhinav";
        names[1] = "Goutam";
        names[2] = "Himanshu";
        names[3] = "Pranjal";
        names[4] = "Rupam";

        String name = names[0];

        System.out.println(name);

        /*------------------------------------------------*/

        // NoTypeSafety -- That means diffrent kinds of data can be stored
        ArrayList list = new ArrayList();
        // To Resolve this -> We have Generics

        list.add("Shivam");
        list.add("Quasran");
        list.add("Prakhar");
        list.add(201);

        String arrName1 = (String) list.get(0);
        System.out.println(arrName1.toUpperCase());

        String arrName2 = (String) list.get(3);
        System.out.println(arrName2.toUpperCase());

        /*------------------------------------------------*/

        // ArrayList with Generics
        ArrayList<String> list2 = new ArrayList<>();
        // We can Write <DataType> on both the sides, but it's not mandatory, only left is enough

        list2.add("Shivam");
        list2.add("Quasran");
        list2.add("Prakhar");
        // list2.add(201); --> This gives compile time error as we can't put it in String ArrayList

        String arr2Name1 = (String) list2.get(0);
        System.out.println(arr2Name1.toUpperCase());

        String arr2Name2 = (String) list2.get(3);
        System.out.println(arr2Name2.toUpperCase());

        /*------------------------------------------------*/


        // ArrayList<int> list2 = new ArrayList<>();  --> Invalid, we can not use primitive datatype for generics, it must be an object


    }
}