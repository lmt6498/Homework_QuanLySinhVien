package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student[] arrStudent = new Student[1];
//        arrStudent[0] = new Student(1, "toan", "nam", 18);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Show");
            System.out.println("5.Tìm kiếm theo id");
            System.out.println("0.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 2:
                    arrStudent = Manager.changeInfo(arrStudent);
                    break;
                case 3:
                    arrStudent = Manager.deleteInfor(arrStudent);
                    break;
                case 4:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.out.println(Manager.findByID(arrStudent));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
