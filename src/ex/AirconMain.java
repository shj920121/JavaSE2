package ex;

public class AirconMain {
	public static void main(String[] args) {
		Aircon air = new Aircon();
		air.powerOnOff();
		
		for(int i=0; i<5;i++)
			air.tempDown();
			
		air.changeMode();		
		air.changeMode();
		air.changeMode();
		
		air.changeWindPower();
		air.changeWindPower();
		air.changeWindPower();
		
		air.changeWindAngle();
		air.changeWindAngle();
		
		air.setTimer();
		air.setTimer();
		air.setTimer();
		air.setTimer();
		air.setTimer();
		air.setTimer();
		
		
		
		
		
	}
}
