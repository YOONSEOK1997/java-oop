package aBlock;

public class One {
    public int a; //외부 클래스가 자유롭게 사용할 수있음
    protected int b; //같은 패키지 또는 자식 클래스에서 사용
    int c; //default  같은 패키지에 소속된 클래스에서만 사용
    private int d; //동일한 클래스 내에 메소드에서만 허용 (또는 자식 클래스)
    
    public void test() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
        this.d = 4;
    }
}
