//Пользователь вводит с клавиатуры число. Необходимо проверить его на четность и нечетность. Если число
//четное требуется вывести на экран число и надпись «Even
//number». Если число нечетное выведите на экран число
//и надпись «Odd number».

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int digit = scanner.nextInt();

        if(digit%2==0){
            System.out.println("Even number");
        }else{
            System.out.println(digit+" Odd number");
        }


    }
}
