package strategy.client;

import strategy.framework.MemberDao;

public class Run {

	public static void main(String[] args) {
		
		String password = new MemberDao().selectPassword("DEV", new ConnectionFactory());
		System.out.println("DEV 사용자의 비밀번호는 " + password + "입니다.");
		
	}
}
