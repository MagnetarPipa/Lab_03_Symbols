package com.company;

import java.util.Scanner;

public class Main<count> {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task8();
        task19();
        task42();
        task63();
    }


    /**
     * 8. Дано целое число N (> 0) и символ C. Вывести строку длины N, которая состоит из символов C.
     */
    private static void task8() {
        System.out.println("\n......Задание 8......\n");
        System.out.println("Введите кол.во символов N:");
        int N = scanner.nextInt();
        System.out.println("Введите символ C:");
        char C = scanner.next().charAt(0);
        for (int i = 1; i <= N; i++) {
            System.out.print(C);
        }
    }

    /**
     * 19. Дана строка. Если она представляет собой запись целого числа, то вывести 1,
     * если вещественного (с дробной частью) — вывести 2; если строку нельзя преобразовать в число,
     * то вывести 0.
     * Считать, что дробная часть вещественного числа отделяется от его целой части десятичной точкой «.».
     */
    private static void task19() {
        System.out.println("\n......Задание 19......\n");
        String str = scanner.nextLine().trim();
        int c = 0;
        for (int i = 0; i <= str.length() - 1; i++) {

            char digit = str.charAt(i);
            int code = (int) digit;
            if (code > 48 && code <= 57) {
                c = 1;
            } else if (code == 46) {
                c = 2;
                break;
            } else {
                c = 0;
                break;
            }
        }
        if (c == 1) {
            System.out.println("Число целое-1");

        } else if (c == 2) {
            System.out.println("Число вещественное с дробной частью-2");
        } else {

            System.out.println("Строку нельзя преобразовать в число-0");
        }


    }

    /**
     * 42. Дана строка, состоящая из слов кириллицей,
     * набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Найти количество слов, которые начинаются и заканчиваются одной и той же буквой.
     */
    private static void task42() {

        System.out.println("\n......Задание 42......\n");
        int count = 0;
        char b = ' ';
        char temp = ' ';
        char t = ' ';
        String s = "НОН ООН";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            System.out.println(c);
            if (chars[i] == b) {

                temp = chars[0];
                t = chars[i - 1];
                if (temp == t) {
                    count++;
                }
            }
        }
        System.out.println("Количество слов:" + count);
    }


    /**
     * 63. Дана строка-предложение заданное кириллицей и число K (0 < K < 10).
     * Зашифровать строку, выполнив циклическую замену каждой буквы на букву того же регистра,
     * расположенную в алфавите на K-й позиции после шифруемой буквы
     * (например, для K = 2 «А» перейдет в «В», «а» — в «в», «Б» — в «Г», «я» — в «б» и т. д.).
     * Букву «ё» в алфавите не учитывать, знаки препинания и пробелы не изменять.
     */
    private static void task63() {

        System.out.println("\n......Задание 63......\n");

        System.out.println("Введите строку-предложение");
        String str = scanner.nextLine();
        System.out.println("Введите число K");
        int K = scanner.nextInt();
        int c = 0, y = 0;
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {

            c = (str.charAt(i) + K);
            if (Character.isUpperCase(str.charAt(i))) {
                y = (c - 1040) % 32 + 1040;
            } else {
                y = (c - 1072) % 32 + 1072;
            }
            encrypted += (char) y;

        }
        System.out.println("Зашифрованая строка:" + encrypted);

    }

}
