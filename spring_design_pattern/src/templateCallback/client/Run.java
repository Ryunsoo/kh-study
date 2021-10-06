package templateCallback.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import templateCallback.framework.MemberDao;
import templateCallback.framework.ConnectionMaker;

public class Run {

	public static void main(String[] args) {
		
		String password = new MemberDao().selectPassword("DEV", new ConnectionMaker() {
			
			@Override
			public Connection getConnection() {
				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bm", "1234");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return conn;
			}
		});
		
		System.out.println("DEV 사용자의 비밀번호는 " + password + "입니다.");
	}
}
