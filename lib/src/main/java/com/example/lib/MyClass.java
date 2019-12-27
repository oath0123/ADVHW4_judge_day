package com.example.lib;


import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 0, month = 0, day = 0, totalday = 0;

            while (true) {
                System.out.println("請輸入幾年幾月幾日");
               
                   try {
                       year = scanner.nextInt();
                       month = scanner.nextInt();
                       day = scanner.nextInt();

                   } catch (Exception e) {
                       System.out.println("只能輸入整數!");
                       return;
                   }

                if (year < 0) {
                    System.out.println("不支援西元前之年分");
                }
                if (month <= 0 || month > 12) {
                    System.out.println("不存在這種月份");
                }
                switch (month) {
                    case 1:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 2:
                        if (year % 4 == 0) {
                            if (day < 1 || day > 29) {
                                System.out.println("不存在這種日期");
                            }
                        } else {
                            if (day < 1 || day > 28) {
                                System.out.println("不存在這種日期");
                            }
                        }
                        break;
                    case 3:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 4:
                        if (day < 1 || day > 30) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 5:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 6:
                        if (day < 1 || day > 30) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 7:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 8:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 9:
                        if (day < 1 || day > 30) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 10:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 11:
                        if (day < 1 || day > 30) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                    case 12:
                        if (day < 1 || day > 31) {
                            System.out.println("不存在這種日期");
                        }
                        break;
                }
                if (year % 4 == 0) {
                    for (int i = 0; i < month - 1; i++) {
                        totalday = totalday + leapYear[i];
                    }
                } else {
                    for (int i = 0; i < month - 1; i++) {
                        totalday = totalday + normalYear[i];
                    }

                }
                totalday = totalday + day;
                System.out.println("這是" + year + "年的第" + totalday + "天");
                totalday = 0;
            }


    }
}
