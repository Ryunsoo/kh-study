package test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//value 속성을 지정하면 getBean()에서 id대신 사용가능하다.
//@Component(value="BMW")
@Component
public class Car {

	//자동으로 Wheel 타입의 Bean을 찾아 의존성 주입해준다.
	@Autowired
	//의존성 주입 시 해당 타입의 Bean이 여러개일때 특정 Bean을 지정해줄때 사용
	@Qualifier(value = "wheelBean")
	private Wheel wheel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Wheel wheel) {
		super();
		this.wheel = wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + "]";
	}
	
}
