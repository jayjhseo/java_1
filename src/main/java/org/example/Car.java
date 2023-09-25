package org.example;


abstract class 전사 {
    String 이름;
    무기 a무기;

    void 공격 () {
        a무기.실행(this.이름);
    }
}
class 홍길동 extends 전사 {
    홍길동() {
        이름 = "홍길동";
    }
}
class 홍길순 extends 전사 {
    홍길순() {
        이름 = "홍길순";
        a무기 = new 칼();
    }
}

class 무기 {
    String 무기이름;
    void 실행(String 사용자이름) {
        System.out.println(사용자이름 + "이(가)" + 무기이름 + "(으)로 공격합니다.");
    }
}
class 활 extends 무기 {
    활() {
        무기이름 = "활";
    }
}
class 칼 extends 무기 {
    칼() {
        무기이름 = "칼";
    }
}
class 창 extends 무기 {
    창() {
        무기이름 = "창";
    }
}