package bBlock;
import aBlock.One; 
public class Three {
    public void oneTest() {
        One one = new One();
        one.a = 1; //public 접근 가능 
        //one.b = 2; //protected 접근 불가
        //one.c = 3; //default 접근 불가
        //one.d = 4; //private 접근 불가 
    }
}
