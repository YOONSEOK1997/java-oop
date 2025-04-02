package ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ActorDao {
    
    // Actor 테이블 데이터를 입력 - insert
	public int insertActor(ActorDto actor) throws ClassNotFoundException, SQLException {
        int row = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "insert into actor(first_name, last_name) values (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","wkqk1234");
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
        conn.close();
		return row;
	}
	
    // Actor 테이블 데이터를 조회 - select
    public ArrayList<ActorDto> selectActorList(int num) throws ClassNotFoundException, SQLException {
        ArrayList<ActorDto> list = new ArrayList<ActorDto>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate from actor order by actor_id desc limit 5";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, num);
        rs=stmt.executeQuery();
        while(rs.next()){
            ActorDto a = new ActorDto();
            a.setActorId(rs.getInt("actorId"));
            a.setFirstName(rs.getString("firstName"));
            a.setLastName(rs.getString("lastName"));
            a.setLastUpdate(rs.getString("lastUpdate"));
            list.add(a);
        }
        conn.close();
        return list;
    }
	
}