package com.example.lib;


import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 0, month = 0, day = 0, totalday = 0;

            while (true) {
                System.out.println("�п�J�X�~�X��X��");
               
                   try {
                       year = scanner.nextInt();
                       month = scanner.nextInt();
                       day = scanner.nextInt();

                   } catch (Exception e) {
                       System.out.println("�u���J���!");
                       return;
                   }

                if (year < 0) {
                    System.out.println("���䴩�褸�e���~��");
                }
                if (month <= 0 || month > 12) {
                    System.out.println("���s�b�o�ؤ��");
                }
                switch (month) {
                    case 1:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 2:
                        if (year % 4 == 0) {
                            if (day < 1 || day > 29) {
                                System.out.println("���s�b�o�ؤ��");
                            }
                        } else {
                            if (day < 1 || day > 28) {
                                System.out.println("���s�b�o�ؤ��");
                            }
                        }
                        break;
                    case 3:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 4:
                        if (day < 1 || day > 30) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 5:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 6:
                        if (day < 1 || day > 30) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 7:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 8:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 9:
                        if (day < 1 || day > 30) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 10:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 11:
                        if (day < 1 || day > 30) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                        break;
                    case 12:
                        if (day < 1 || day > 31) {
                            System.out.println("���s�b�o�ؤ��");
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
                System.out.println("�o�O" + year + "�~����" + totalday + "��");
                totalday = 0;
            }


    }
}
