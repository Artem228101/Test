package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Для перевода из рублей в доллары введите \n Р" +
                "\nДля перевода из долларов в рубли, введите\n Д");

        String str = in.nextLine();
        float course = 70.06f;

        if (str.equals("Р")) {
            try {
                System.out.println("Введите рубли");
                float number = in.nextFloat();
                System.out.println(getaFloat(course, number) + " долларов");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
            }
        } else if (str.equals("Д")) {
            try {
                System.out.println("Введите доллары");
                float number = in.nextFloat();
                System.out.println(getaFloat1(course, number) + " рублей");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
            }

        }
        else{
            System.out.println("Вы ввели неправильные данные");
        }
    }

    public static float getaFloat1(float course, float number) {
        return course / number;
    }

    public static float getaFloat(float course, float number) {
        return number / course;
    }
}