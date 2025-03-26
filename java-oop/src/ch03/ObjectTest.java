package ch03;

public class ObjectTest {

    public static void main(String[] args) {
        //Car car;
        //car = new Car();
        Car car = new Car();
        car.onOff = true;
        car.name = "제네시스";
        car.color = "검정";
        car.move();
        
        Car car2 = new Car();
        car2.onOff = false;
        car2.name = "K9";
        car2.color = "gray";
        car.move();

        Doctor doctor = new Doctor();
        doctor.person = new Person();
        doctor.person.age = 35;
        doctor.person.name ="이재명";
        doctor.major = "내과";

        Doctor2 doctor2 = new Doctor2();
        doctor2.name ="윤석열";
        doctor2.major ="외과";
    }
}