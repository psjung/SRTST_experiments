
public class WiperSystem {
	private Wiper wiper;
	private int event;
	

	
	public WiperSystem(){
		event = 0;
		wiper = new Wiper();
	}
	
	public void getEvent(int event){
		//0: non, 1: rain, 2: heavyRain
		this.event = event;
	}
	
	public void runWipe(){
		wiper.setEvent(event);
		wiper.run();
	}
	
	
	public void turnOnInterval(){
			wiper.setIntervalOn();
	}
	
	public void turnOffInterval(){
		turnOffWipe();
	}
	
	public void turnOffWipe(){
		wiper.turnOff();
	}
}
