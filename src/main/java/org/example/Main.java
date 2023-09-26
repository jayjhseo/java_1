package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;
//set,get
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.setId(20);

        System.out.println("제 번호는 " + a사람.getId() + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class 사람 {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;

    public void setId (int id) {
        this.id = id;
    }
    public int getId () {
        return this.id;
    }
}