package org.example;

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;
    void 공격() {
        a무기.공격();

    }
}
abstract class 무기 {
    void 공격() {}
}

class 활 extends 무기{
    void 공격 () {
        System.out.println("전사가 활로 공격합니다");
    }
}
class 칼 extends 무기{
    void 공격() {
        System.out.println("전사가 칼로 공격합니다");
    }
}
