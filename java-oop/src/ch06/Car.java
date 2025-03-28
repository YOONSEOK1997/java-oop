package ch06;

import java.util.ArrayList;

public class Car {
    public int num;
    public boolean is;
    public String str;
    public ArrayList<String> list;

    // //생성자가 없으면 컴파일러 기계어로 변경할때 기본 생성자 모양으로 자동으로 추가함 
    // public Car() {
    //     //필드 초기화 코드도 자동으로 추가
    //     //필드는 초기화의 규칙이 필요
    //     this.num = 0;
    //     this.is = false;
    //     this.str = null;
    //     this.list = null;
    // }

    public Car () {
        System.out.println("CC");
     }
    public Car (int x) {
        // 일반생성자가 존재하므로 컴파일러가 기본생성자를 추가 x 
        // 생서자안에 필드초기화 코드가 없다 - >추가
         this.num =x ;
    }
    public Car(int num, boolean is ) {
        this();
        this.num = num;
        this.is = is;
    }


        
    public void print() {
        System.out.println("this =" + this.num);
    }
}