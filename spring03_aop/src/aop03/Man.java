package aop03;

import org.springframework.stereotype.Component;

@Component
public class Man{

	public void develop() {
		//int i = 10/0; //예외 발생시키기
		System.out.println("파이썬으로 개발한다.");
	}
	
	public String play() {
		return "리니지W";
	}
}
