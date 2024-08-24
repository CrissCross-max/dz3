//Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
//переводит метры в мили, дюймы или ярды

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров");

        int meters = scanner.nextInt();

        System.out.println("Выберете действие");
        System.out.println("1-Перевести в мили");
        System.out.println("2-Перевеси в дюймы");
        System.out.println("3-Перевести в ярды");

        int option = scanner.nextInt();

        if(option==1){
            System.out.println(meters*1609);
        }

        if(option==2){
            System.out.println(meters*2.54);
        }

        if(option==3){
            System.out.println(meters*1.094);
        }

    }

}
