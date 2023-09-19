package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[3];
		arr[0] = 10;
		arr[0] = 20;
		arr[0] = 30;
		*/

        System.out.println(sum / arr.length);
    }
}