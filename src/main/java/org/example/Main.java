package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

//set,get
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        while (true) {
            System.out.println("나이를 입력해주세요 : ");
            try {
                age = scan.nextInt();
                if (age < 1) {
                    System.out.println("음수는 안됩니다.");
                    continue;
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("문자열은 안됩니다.");
                continue;
            }
            break;
        }
        System.out.println(age + "살 입니다.");
    }

}


