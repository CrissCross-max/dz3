//Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
//на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args){
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);

        int firstDigit = scanner.nextInt();

        System.out.println("Введите второе число");

        int secondDidit = scanner.nextInt();

        System.out.println("Введите третье число");

        int thirdDigit = scanner.nextInt();

        System.out.println("Выбирите действие n/ 1.Максимум из трех n/ 2.Минимум из трех. /n 3.Среднеарифмитическое");

        int option = scanner.nextInt();

        int max =Math.max(Math.max(firstDigit, secondDidit), thirdDigit);
        int min =Math.min(Math.min(firstDigit, secondDidit), thirdDigit);
        int mid = firstDigit+secondDidit+thirdDigit-(max-min);

        if(option==1){
            System.out.println("Максимальное число"+max);
        }
        if(option==2){
            System.out.println(("Минимальное число"+min));
        }
        if(option==3){
            System.out.println("Среднее число"+mid);
        }


    }
}
