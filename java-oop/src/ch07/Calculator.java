package ch07;

public class Calculator {

    public Calculator(){
            this.power = false;
    }
    public boolean power;
    public int num;

    //this.num * ( 0.5 ~ 1.5)
    public double setRateNum(double rate) {
        double result = 0;
        if(!this.power) { //this.power == false 
            System.out.println("계산기가 OFF 상태");
        }else {
            if(!(rate >= 0.5 && rate <= 1.5 )){
                System.out.println("입력값 ERROR");
            }else  {
                result = this.num * rate;
            }
        }return result;
    }

    
    public  void setPower() {
        this.power = !this.power;
    }
    
    public void setNum(int num){
        if(this.power ){
            this.num = num;
        } else {
            System.out.println("계산기가 OFF 상태");
        }
        
    }

    //this.num이 짝수인지 홀수 인지 알고 싶은 메서드  
    public String holejjak() {
        String result = "";
        if(this.power){
            if(this.num %2 == 0 ){
                result = "jjak";
            }
            else{
                result = "hole";
            } 
            
        }else {
            System.out.println("계산기가 꺼져있습니다");
            result = "ERROR";
        }
        return result;
        
    }
}