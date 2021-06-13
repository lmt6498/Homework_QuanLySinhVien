package com.codegym;

import java.util.Scanner;

public class Manager {
    public static Student[] create(Student[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập Id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Name:");
        String name = sc.nextLine();
        System.out.print("Nhập Gender:");
        String gender = sc.nextLine();
        System.out.print("Nhập Age:");
        int age = Integer.parseInt(sc.nextLine());

        Student student = new Student(id, name, gender, age);
        Student[] arrNew = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }

        arrNew[arrNew.length - 1] = student;

        return arrNew;
    }
    public static Student[] changeInfo(Student[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID cần sửa: ");
        int index = Integer.parseInt(sc.nextLine()) -1;
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Name: ");
        String name = sc.nextLine();
        System.out.print("Nhập Gender: ");
        String gender = sc.nextLine();
        System.out.print("Nhập Age: ");
        int age = Integer.parseInt(sc.nextLine());

        Student student = new Student(id, name, gender, age);
        arr[index] = student;
        return arr;
    }
    public static Student[] deleteInfor(Student arr[]) {
        System.out.println("Nhập id muốn xóa: ");
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine()) -1;
        Student[] arrNew = new Student[arr.length - 1];

        for (int i = index; i < arrNew.length; i++ ) {
            arr[i] = arr[i + 1];
        }
        for (int j = 0; j < arrNew.length; j++) {
            arrNew[j] = arr[j];
        }
        return arrNew;
    }
    public static Student findByID(Student arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID muốn tìm: ");
        int index = Integer.parseInt(sc.nextLine())-1;
        return arr[index];
    }

}
