package ch02;
import ch02.*;
import java.lang.*;

public class EnumTest {
    public static void main(String[] args) {
        
        char gender = 'ㅁ';

            if (gender == 'M') {
                System.out.println("남자");
            } else if (gender == 'F') {
                System.out.println("여자");
            } else {
                System.out.println("잘못된 값입니다");
            }
        

    Gender gender2 = null;
    if(gender2 == Gender.MALE){
        System.out.println("남자");
    } else{
        System.out.println("여자");
    }
    //Enum 사용시 if보다 switch가 가독성이 높을 수 있다.
    switch (gender2) {
        case Gender.MALE:
            System.out.println();
            break;
        case Gender.FEMALE:
            System.out.println(); 
            break;
            
    }
    }
}
