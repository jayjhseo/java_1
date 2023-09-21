package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        원숭이 a원숭이 = new 원숭이();

        // 문제 1 : 아래 줄의 코드가 되는 이유 설명
        동물 a동물 = a원숭이;
        //상황: 현재 원숭이라는 클래스가 동물 클래스에 상속이 되었다.
        //정답1: 원숭이는 동물에 상속이 되어 있기 때문에 a동물 변수는 동물 객체와 연결이
//        되어 있지만
        원숭이 a원숭이2 = null; // null 은 쓰레기 리모콘이라는 뜻

        // 문제 2 : 아래 줄의 코드가 안되는 이유 설명
        // a원숭이2 = a동물;

        // 문제 3 : 아래 줄의 되는 이유 설명
        a원숭이2 = (원숭이)a동물;

        사람 a사람2 = null;

        // 문제 4 : 아래 줄의 코드가 수동 형변환 까지 했는데도 안되는 이유 설명
        // a사람2 = (사람)a동물;
    }
}
abstract class 동물 {
    void 숨쉬다() {
        System.out.println("동물이 숨을 쉽니다.");
    }
}
class 사람 extends 동물 {
    void 말하다() {
        System.out.println("사람이 말을 합니다.");
    }
}
class 원숭이 extends 동물 {
    void 원숭이묘기를하다() {
        System.out.println("원숭이묘기를하다.");
    }
}