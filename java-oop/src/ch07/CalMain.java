package ch07;

import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        //c.power = true;     
        System.out.println(c.power); //false
        c.setPower();  //  this.power = !this.power;
        System.out.println(c.power); // true
        c.setPower();   // this.power = !this.power;
        System.out.println(c.power ); //  false 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 6입력하세요");
        int inputNum = Integer.parseInt(sc.nextLine());
        c.setNum(inputNum);
    
        c.holejjak();

        String result = c.holejjak();

        System.out.println("result=" + result);
        
        System.out.println(c.setRateNum(-0.777));
    }

        
}
