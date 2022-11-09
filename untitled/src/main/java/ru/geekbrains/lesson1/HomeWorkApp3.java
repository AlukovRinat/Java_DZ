package ru.geekbrains.lesson1;

import java.util.Arrays;

public class HomeWorkApp3 {


    public static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
            {
                arr[i]=1;
            }
             else {
                arr[i]=0;
            }
            }
               }




//2

 public static String createArrey() {
     int[] arr = new int[100];
     for (int i = 0; i < arr.length; i++){
         arr[i]=i+1;
     }
     return Arrays.toString(arr);
 }

 //3
public static void changeArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] < 6) {
            array[i] = array[i] * 2;
        }
        System.out.print(array[i] + " ");
    }}
// 4
    public static void changeDiagonalValue( ){
        System.out.println(" ");
        int[][] arr = new int[][] {{0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}};
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
if (i==j){
    arr[i][j]=1;
}
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    //5
    public static void setInitialValueArray (int[] arr, int initialValue){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
//6
    public static void minandmax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
            max=arr[i];
        }
        }
        System.out.println(min);
        System.out.println(max);
    }

    //7
    static boolean Check(int[] arr)
    {
        boolean balanceExist = false;

        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int rightSum = 0;
        for (int i = 0; i < arr.length; i++)
        {

            rightSum += arr[i];

            if (rightSum == arrSum - rightSum)
            {
                balanceExist = true;

            }
        }

        return balanceExist;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(createArrey());

        changeArray(arr2);

        changeDiagonalValue();

int[] arr3=new int[10];
        setInitialValueArray(arr3,1);

        int[] arr4=new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        minandmax(arr4);

        int[] arr5 = new int[] {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(Check(arr5));
    }

}