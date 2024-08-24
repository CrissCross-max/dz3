//Пользователь с клавиатуры вводит количество часов.
//Если полученное значение находится в диапазоне от 0 до
//6 нужно вывести надпись «Good Night», если в диапазоне
//от 6 до 13 «Good Morning», если в диапазоне от 13 до 17
//«Good Day», если в диапазоне от 17 до 0 «Good Evening».
//Верхняя граница диапазона не включается. Например,
//число 6 относится к 6 до 13

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество часов");

        int hours = scanner.nextInt();

        if(hours>=0&&hours<=5){
            System.out.println("Good night");
        }

        if(hours>=6&&hours<=12){
            System.out.println("Good morning");
        }

        if(hours>=13&& hours<=16){
            System.out.println("Good day");
        }

        if(hours>=16&&hours<=23){
            System.out.println("Good evening");
        }
    }
}
