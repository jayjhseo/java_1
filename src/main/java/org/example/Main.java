package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

//set,get
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        System.out.println("키를 입력하세요 : ");
        System.out.println("이름을 입력하세요 : ");
        int age = scan.nextInt();        //nextInt() - int값을 받는다
        int height = scan.nextInt();
        String name = scan.next();

        scan.nextLine();




        System.out.println(age + "살 입니다.");
        scan.nextLine();
        System.out.println(height + "cm 입니다.");
        scan.nextLine();
        System.out.println(name + "입니다.");

//Exception
    }
}