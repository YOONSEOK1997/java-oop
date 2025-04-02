package ch10;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		System.out.println("firstName: "+firstName);
		System.out.println("lastName: "+lastName);
		scanner.close();
		

        //2
		ActorDto actorDto = new ActorDto();
		actorDto.setFirstName(firstName);
		actorDto.setLastName(lastName);
		
        //3) 입력 insert 모듈 (메서드) 호출
        ActorDao actorDao = new ActorDao();
		int row = actorDao.insertActor(actorDto);
	
		
		// 조회 select 모듈(메서드) 호출
        ArrayList<ActorDto> list = actorDao.selectActorList(5);
        
        //5 출력
        for(ActorDto a : list) {
            System.out.println(a.getActorId()+"\t"+a.getFirstName()+"\t"+a.getLastName()+"\t"+a.getLastUpdate());
        }
	}
}