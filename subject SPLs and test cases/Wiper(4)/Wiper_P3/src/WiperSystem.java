
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
	
	public void turnOnManual(){
		if(wiper.isOn() == false)
			wiper.setManualOn();
	}
	
	public void turnOnInterval(){
		if(wiper.getPermanantWipe() == false)
			wiper.setIntervalOn();
	}
	
	public void turnOffInterval(){
		turnOffWipe();
	}
	
	public void permanentRun(){
		if(wiper.getManualOn() == true && wiper.getIntervalOn() == false)
			wiper.setPermanantWipe();
	}
	
	public void turnOffWipe(){
		wiper.turnOff();
	}
}
