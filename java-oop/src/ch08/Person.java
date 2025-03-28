package ch08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Person {
    public String id;
    public String pw; 
    public Person(String id, String pw ){ //오버로딩 
        this.id = id;
        this.pw = pw;
    }
    //1-9 리턴타입 : void, 매개변수 : HashMap
    public void m19a(HashMap<String,Object> map) {
        System.out.println(map.get("name"));
        System.out.println((Integer)(map.get("age")));
        String[] hobby = ((String[])map.get("hobby"));
        for(String h : hobby){
            System.out.print(h+ ",");
        }
        Data data = (Data)(map.get("data"));
        System.out.println(data.x);
        System.out.println(data.y);
    }
    // 1-8 리턴타입 : void ,매개변수 : ArrayList
    public void m18a(ArrayList<Integer> year ) {
        System.out.println("입력된 리스트중 윤년은");
        for(Integer y: year){
            if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.println(y+ "");
            }
        }
    }
    //1-5 리턴타입 : void , 매개변수 : class
    public void m15a(Data d){
        d.y = d.y*100;
    }
    //1-6 //리턴타입 : void 매개변수 ;ㅣ class[
    public void m16b(Data[] datas, int y){
    for(Data d: datas){
        if(d.y == y){
            System.out.println("d.x " + d.x);
        }
    }
    }
    public void m16a(Data[] datas){
        for(int i=0; i<datas.length; i++){
            if(datas[i].x % 2 ==1){
                System.out.println(datas[i].y + ",");

            }
        }
    }
    
    //글자수 짝 / 홀
    public void m13a(String name){
        if(name == null){
            System.out.println("null 입력 불가");
            return;
        }
        int len = name.length();
        if(len % 2 == 0){
            System.out.println("짝수 ");
        }else{
            System.out.println("홀수");
        }
    }
    //1-3 리턴타입 : void ,매개변수 : String
    //로그인(Person id , pw가 동일하면 로그인)
    public void m13b(String id , String pw){
        if(this.id.equals(id) && this.pw.equals(pw)){
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }
    }
    
    // 1-4 리턴타입 : void , 매개변수 : String
    public void m14a(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+",");
        }
        System.out.println("");
    }
    //1-1 리턴타입 : void , 매개변수 : 없음
    public void m11() {
        System.out.println("Hello");
 
    }
    //1-1 과제 ) 리턴타입 : void, 매개변수 : 없음
    //12:00 굿모닝
    //18:00 굿애프터눈
    //00:00 good evening
    
public void greet(){
    Calendar c = Calendar.getInstance();
    Calendar.getInstance();
      int hour = c.get(Calendar.HOUR);
      if(hour <= 12) {
          System.out.println("Good Morning");
      }
      else if(hour <= 18){
           System.out.println("Good Afternoon");
      }
      else if(hour >=0 || hour < 18){
        System.out.println("Good Night");
      }
      else{
          System.out.println("Good Evening");
      } 
   }

   // 1-2 리턴타입 : void, 매개변수 :int
   //매개변수 : int ( 시간 0 ~ 23 )
public void m12(int time){
    if(time < 0 || time > 23) {
        System.out.println("0~23 입력하세요");
        return;
    }
    if(time < 12 ) { 
        System.out.println("AM");
    }else {
        System.out.println("PM");
    }
}
public void hw12(boolean flag) {
    flag = true;
    System.out.println(flag);
}



}

