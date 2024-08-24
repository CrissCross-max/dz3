//Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
//на экран сумму трёх чисел или произведение трёх чисел.

import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");

        int firstDigit = scanner.nextInt();

        System.out.println("Введите второе число");

        int secondDigit = scanner.nextInt();

        System.out.println("Введите третье число");

        int thirdDigit = scanner.nextInt();

        System.out.println("Сумма чисел нажмите 1. Произведение нажмите 2");

        int choose = scanner.nextInt();

        if(choose==1){
            System.out.println(firstDigit+secondDigit+thirdDigit);
        }else{
            System.out.println(firstDigit*secondDigit*thirdDigit);
        }

    }
}
