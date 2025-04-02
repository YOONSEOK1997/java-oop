package dto;

public class MemberMain {
    public static void main(String[] args) {
        MemberDto m1 = new MemberDto();
       // m1.id = "yoon";
        m1.setId("yoon");
        //m1.age = 22;
        //m1.pw = "1234";
        //캡슐화 메서드를 사용

        //필드값 읽기
        //정보은닉으로 사용 x
        //System.out.println(m1.id);
        System.out.println(m1.getId());
        System.out.println(m1.getAge());
        System.out.println(m1.getPw());

        //캡슐화 메서드를 사용 
    }
}
