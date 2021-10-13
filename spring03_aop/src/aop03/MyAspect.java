package aop03;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect{
	
	@Before(value = "execution(* *(..))")
	public void before() {
		System.out.println("출근 카드를 찍는다.");
	}
	
	@After(value = "execution(* *(..))")
	public void after() {
		System.out.println("집에 간다.");
	}
	
	@AfterReturning(value = "execution(* *(..))", returning = "res") //사용자 코드에서 반환되는 값이 있을 때 afterReturning의 매개변수로서 사용한다.
	public void afterReturning(Object res) {
		System.out.println(res);
		System.out.println("퇴근 카드를 찍는다.");
	}
	
	@AfterThrowing(value = "execution(* *(..))", throwing = "exception") //예외객체를 받을 메서드 매개변수명
	public void afterThrowing(Exception exception) {
		System.out.println(exception.getMessage());
		System.out.println("쉬는 날이었다.");
	}
}
