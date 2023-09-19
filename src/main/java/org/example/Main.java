package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 3) {
                System.out.println(j);
                j++;
            }
            i++;
        }


        // 출력
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
    }
}
