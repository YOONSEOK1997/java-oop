package ch05;

import javax.swing.text.MaskFormatter;

public class ClassMember {
    //1.static
    //1-1) static method
    public static void main(String[] args) {
        System.out.println("sFun()");
    }
    //1-2) static field
    public static int x = 1;
    
    //초기화
    //public static int[] arr= null; or 
    public static int[] arr = { 1, 2, 3};

    public static int y = (int)Math.random(); //

    
    //1-3 static block
    static {
        ClassMember.arr = new int [3];
        for(int i=0; i<ClassMember.arr.length; i++) {
            int rNum = (int)(Math.random()+10) +1; 
            ClassMember.arr[i] = rNum;
        }
    }
    //2.생성자
    public ClassMember() { // 없으면 기본형태로 자동으로 생성함 (컴파일러)
        //필드 초기화 코드가 없다면 자동으로 코드가 구현됨(컴파일러)
        this.name = null;

    }
    //3. 메서드
    public void fun () {
        System.out.println("fun()");
    }
    // 4. 필드
    public String name; 

    public class InClass {} // 내부 클래스
    public enum eNum {      // 내부 Enum
        x ,y            
    }
    public interface InInterFace {
    }
    public @interface InAnnotation {
        
    }
}
    

