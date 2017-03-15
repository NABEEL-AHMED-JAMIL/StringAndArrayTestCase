package com.Array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Nabeel on 3/15/2016.
 */
public class Array_Funcation {
    //
    //Ok
    // test the both String and List

        public final static void test(Object get , Object expected){

            try {
                // condition used for result

                if (get.toString().equalsIgnoreCase(expected.toString())){

                    System.out.print("OK"+"  ");
                }
                // condition used for reject the result
                else{
                    System.out.print("XX"+"  ");
                }
            } catch (Exception e) {
                //
                System.out.println("System not working ");
            }

        }

        // Ok
        // test the match ends and send back to the main

        public final static Object match_ends(Object match_e[]){

            try {
                // count the word

                int count_end = 0;
                // get the single word
                Object get_word;
                // break the word into the single char but the type is Object
                Object temp = null,temp2 = null;
                // used the loop to access the array index

                for(Object match_key : match_e){

                    // assign the word to the single object
                    get_word = match_key.toString();
                    // condition for null or empty String
                    if(!get_word.equals("")){
                        // get the first single letter but the type is Object
                        temp = get_word.toString().charAt(0);

                        // get the last single letter but the type is Object
                        temp2 = get_word.toString().charAt(get_word.toString().length()-1);

                        // condition for both first and end are equal if true it count else not
                        if(temp.toString().equalsIgnoreCase(temp2.toString())){

                            count_end += 1;
                        }
                    }
                }
                // return the Result of the Process
                return count_end;

                // catch used to handle the exception

            } catch (Exception e) {

                // if the exception is rise it show the message of the error

                return "Indext out of Range The Error are found in method match_End";
        }
    }

    // Ok
    // test the front_x and send back to the main
    public final static Object front_x(Object f_x[]){
        // get the two array
        // array with_x
        ArrayList<Object> array_with_xs = new ArrayList<Object>();

        // array with_out x
        ArrayList<Object> array_without_xs = new ArrayList<Object>();

        // loop for adding the item individual
        //
        for (Object object : f_x) {

            // condition for front_X
            if((object.toString().charAt(0) == 'x') || (object.toString().charAt(0) == 'X')){

                // add the front_x
                array_with_xs.add(object);
            }else{

                // add the non_Front_x
                array_without_xs.add(object);
            }
            }
            // sort the both the array
            Collections.sort(array_with_xs,null);
            //
            Collections.sort(array_without_xs,null);
           //
           // know Combine the both array,s into the array_with_xs
           for (Object object : array_without_xs ) {

               array_with_xs.add(object);
           }

           // send array for test
        return array_with_xs.toString();
    }
    // Ok
    // test the sort_last and send back to the main
    public final static Object sort_last(Object array_sort_last_1[][]){
    // Method work only Integer
    // get the temp array for single index change
     Object temp1[];
        // loop's work like a sort-ing
        // outer-loop
        for(int i = 0; i < array_sort_last_1.length-1; i++) {
            // inner-loop
            for (int j = i+1; j < array_sort_last_1.length; j++) {
                // condition watch
                // (Integer) casting required to convert the object element into the Integer

                if(((Integer) array_sort_last_1[i][array_sort_last_1[i].length-1] > (Integer) array_sort_last_1[j][array_sort_last_1[j].length-1])){

                    // sewap_ing apply_ing on the address of the array not on item
                    temp1 = array_sort_last_1[i]; array_sort_last_1[i] = array_sort_last_1[j]; array_sort_last_1[j] = temp1;

                }
            }
        }    // send array for test
        //
        return Arrays.deepToString(array_sort_last_1);

    }

    // Ok
    // test the remove_adjacent and send back to the main
    public final static Object remove_adjacent(Object r_adjacent[]){
    // get the temp array and pass the all element
    // of the first array into the temp
    ArrayList<Object> temp_Array = new ArrayList<Object>();
        // loop used to get the single item at one time
        for (Object object : r_adjacent) {
            // if it contains the object into the array it
            // become false and not item more add to the temp
            if(!(temp_Array.contains(object))){
                // add teh single object to the temp_Array
                temp_Array.add(object);
            }

    } // return the array as the type of string
      return temp_Array.toString();
        //
    }
    // Ok
    // test the linear_merge and send back to the main
    public final static Object linear_merge(Object list1[], Object list2[]){
    //
    // merge mean combine to list into single list
    ArrayList<Object> object = new ArrayList<Object>();
    // add the first list
    for (Object object1 : list1) {
    // condition for front_X
     object.add(object1);
    }
    // add the second list
    for (Object object2 : list2) {
      // condition for front_X
        object.add(object2);
    }
    // sort the list by use of the Collection
    Collections.sort(object,null); return object.toString();
    }
    //
    // Main Method
    public static void main(String[] args) {


    //Ok
    // Match_end problem
    System.out.println("Match_End");
        // array 1 match_ends
        Object array[] = {"xxa",121, "aa", "x", "bbb"};
        test(match_ends(array), 4);
        // array 2 match_ends
        Object array1[] =  {"", "xyw", "xy", "xyx", "xx"};
        test(match_ends(array1), 2);
        // array 3 match_ends
         Object array2[] = {"aaA", "be", "abc", "hello"};
        test(match_ends(array2), 1);
        //------------------------------------------------
        // Ok
        // Sort problem
         System.out.println("\nSort_last");

        // array,s 1 sort_last
        Object array_sort_last_1[][] = { {1, 3}, {3, 2}, {2, 1}};
        Object array_sort_last_1_1[][] = { {2, 1}, {3, 2}, {1, 3}};
        test(sort_last(array_sort_last_1), Arrays.deepToString(array_sort_last_1_1));
        // array,s 2 sort_last
        Object array_sort_last_2[][] = {{2, 3},{1, 2},{3, 1}};
        Object array_sort_last_2_2[][] = {{3, 1}, {1, 2}, {2, 3}};
        test(sort_last(array_sort_last_2), Arrays.deepToString(array_sort_last_2_2));

        // array,s 3 sort_last
        Object array_sort_last_3[][] = {{1, 7}, {1, 3}, {3, 4, 5}, {2, 2}};
        Object array_sort_last_3_3[][] = {{2, 2}, {1, 3}, {3, 4, 5}, {1, 7}};
        test(sort_last(array_sort_last_3), Arrays.deepToString(array_sort_last_3_3));

        //------------------------------------------------
        // Ok
        // Front_end problem
           System.out.println("\nFront_X");
        // array,s 1 front-x
        Object array_front_x1[] = {"bbb", "ccc", "axx", "xzz", "xaa"};
        Object array_front_x1_1[] = {"xaa", "xzz", "axx", "bbb", "ccc"};
        test(front_x(array_front_x1), Arrays.toString(array_front_x1_1));
        // array,s 2 front-x
        Object array_front_x2[] = {"ccc", "bbb", "aaa", "xcc", "xaa"};
        Object array_front_x2_2[] = {"xaa", "xcc", "aaa", "bbb", "ccc"};
        test(front_x(array_front_x2), Arrays.toString(array_front_x2_2));

        // array,s 3 front-3
        Object array_front_x3[] = {"mix", "xyz", "apple", "xanadu", "aardvark"};
        Object array_front_x3_3[] = {"xanadu", "xyz", "aardvark", "apple", "mix"};
        test(front_x(array_front_x3), Arrays.toString(array_front_x3_3));

        //---------------------------------------------------
        // Ok
        // Remove adjacent problem

        System.out.println( "\nremove_adjacent");

        // array,s 1 r_adjacent
        Object r_adjacent[] = {1, 2, 2, 3};
        Object r_adjacent1[] = {1, 2, 3};
        test(remove_adjacent(r_adjacent), Arrays.toString(r_adjacent1));
        // array,s 2 adjacent
        Object r_adjacent2[] = {2, 2, 3, 3, 3};
        Object r_adjacent2_2[] = {2, 3};
        test(remove_adjacent(r_adjacent2), Arrays.toString(r_adjacent2_2));

        // array,s 3 adjacent
        //
        Object r_adjacent3[] = {};
        Object r_adjacent3_3[] = {};
        test(remove_adjacent(r_adjacent3), Arrays.toString(r_adjacent3_3));

        //---------------------------------------------------
        // Ok
        // linear merge Problem
            System.out.println("\nlinear_merge");
        // array,s 1 linear_merge
        Object temp_list1[] = {"aa", "xx", "zz"};
        Object temp_list1_1[] = {"bb", "cc"};
        Object temp_list1_1_1[] = {"aa", "bb", "cc", "xx", "zz"};
        test(linear_merge(temp_list1, temp_list1_1), Arrays.toString(temp_list1_1_1));

        // array,s 2 linear_merge
        Object temp_list2[] = {"aa", "xx"};
        Object temp_list2_1[] = {"bb", "cc", "zz"};
        Object temp_list2_1_1[] = {"aa", "bb", "cc", "xx", "zz"};
        test(linear_merge(temp_list2, temp_list2_1), Arrays.toString(temp_list2_1_1));

        // array,s 3 linear_merge
        Object temp_list3[] = {"aa", "aa"};
        Object temp_list3_1[] = {"aa", "bb", "bb"};
        Object temp_list3_1_1[] = {"aa", "aa", "aa", "bb", "bb"};
        test(linear_merge(temp_list3, temp_list3_1), Arrays.toString(temp_list3_1_1));

        //----------------------------------------------------------
        // ------------------------Best of Luck----------------------

    }
}
