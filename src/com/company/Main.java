package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    list.add(i);
                }

                List<String> list2 = new ArrayList<>();
                list2.add("ssss");
                list2.add("gg");
                list2.add("wp");


                Integer[] array = new Integer[] { 1,2,3,4,5,6,7,8,9,0};
                System.out.println(Arrays.toString(array));

                System.out.println(Arrays.toString(change(array, 1,5)));

            }



            public static <T> T[] change(T[] array, int i, int i2) {

                T[] arr = array;

                T a = arr[i];
                arr[i] = arr[i2];
                arr[i2] = a;

                return arr;
            }
        }


