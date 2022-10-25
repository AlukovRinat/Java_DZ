package ru.geekbrains.lesson1;

public class HomeWorkApp2
{
    static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }
    static String printPositiveOrNegative(int num) {
        System.out.println("\nЗадание 2.");
        String word = "Положительное";
        if (num < 0) word = "Отрицательное";

        return word;
    }
    public static boolean heckNegativec(int a){
        System.out.println("\nЗадание 3.");
        return a < 0;

    }
    public static void printString(String a, int b) {
        System.out.println("\nЗадание 4.");
        for (int i=0; i<b; i++){
            System.out.println(a);
        }
    }
    public static void chekLeapYar(int a) {
        System.out.println("\nЗадание 5.");
        if ((a%4==0&&a%100!=0)||(a%400==0)){
            System.out.println("Весокосный");
        }else {System.out.println("Не весокосный");}
    }

    public static void main(String[] args){
        System.out.println( doThree(6,7));
        System.out.println( printPositiveOrNegative(6));
        System.out.println( heckNegativec(8));
        printString("Ксюша-солнышко",5);
        chekLeapYar(2300);
    }
    }


