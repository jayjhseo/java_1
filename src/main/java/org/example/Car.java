package org.example;

class 표준Tv {
    void 켜기 () {}
    void 끄기 () {}
}
class 샤오미Tv extends 표준Tv {
    void vr켜기 () {
        System.out.println("샤오미Tv vr켜기!");
    }
}
class 삼성Tv extends 표준Tv {
    void ar켜기 () {
        System.out.println("삼성Tv ar켜기!");
    }
}
class LGTv extends 표준Tv {
    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");

    }
}