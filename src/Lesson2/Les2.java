package Lesson2;

import java.util.Scanner;

public class Les2 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner (System.in);
            System.out.print("Введите ваше имя: ");
            String Name = scanner.nextLine();
            System.out.print("Введите город вашего проживания: ");
            String City = scanner.nextLine();
            System.out.print("Введите ваш возраст: ");
            int Age = scanner.nextInt();
            scanner.nextLine();
            // Команда необходима для опорожнения буфера после nextInt();

            System.out.print("Введите ваше хобби: ");
            String Hobby = scanner.nextLine();
            System.out.println();
            //        ----------------------------------
            System.out.println("Вариант 1 (табличный):");
            System.out.println("Имя:\t\t" + Name);
            System.out.println("Город:\t\t" + City);
            System.out.println("Возраст:\t" + Age);
            System.out.println("Хобби:\t\t" + Hobby);
            System.out.println();
            //        ----------------------------------
            System.out.println("Вариант 2 (текстовый):");
            System.out.printf("Человек по имени %s живет в городе %s.\n", Name, City);
            System.out.printf("Этому человеку %s лет и любит он заниматься %s.\n\n", Age, Hobby);
            //        ----------------------------------
            System.out.println("Вариант 3 (иной):");
            System.out.println(Name + " - имя");
            System.out.println(City + " - город");
            System.out.println(Age + " - возраст");
            System.out.println(Hobby + " - хобби");
        }}

