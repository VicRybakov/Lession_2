package com.lession;

public class main{
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        double c = 3.3;
        int e = 2147483647;

        System.out.println("Сложение и вычетание целочисленных");
        System.out.println("Сумма двух целых чисел=" + (a + b));
        System.out.println("Сумма целочисленого и числа с плавающей точкой=" + (c + a));
        System.out.println("Сравнение");
        System.out.println(a +"="+ b + " " + (a==b));
        System.out.println(a +"<"+ b + " " + (a<b));
        System.out.println("Переполнение"  + (e + 1));
    }
}