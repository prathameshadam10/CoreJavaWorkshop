package com.bridgelabz;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        DeleteElement deleteElement = new DeleteElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of An Array");
        int size = sc.nextInt();
        int array[] = new int[size];
        deleteElement.deletingElement(array);

    }
        private void deletingElement ( int[] array){
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter Elements of an array");

            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }


            System.out.println("Elements of Array Before Deleting");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println("Enter the Index which you have to Delete");

            int a = sc.nextInt();
//        {12,4,55,67,78}
            System.out.println("Deleting The Element in array By Specified Index");
            for (int i = a; i < array.length - 1; i++) {
                array[i] = array[i + 1];

            }

            System.out.println("Array after deletion:");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.println(array[i] + " ");

            }
            System.out.println();

        }

        }




