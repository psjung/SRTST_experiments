public class Wiper {
	private Sensor sensor;
	
	private boolean isIntervalOn;
	private boolean isSlowWipe;
	private boolean isFastWipe;
	private boolean OnOff;
	
	
	public Wiper(){
		sensor = new Sensor();
		OnOff = false;
		isIntervalOn = false;
		isSlowWipe = false;
		isFastWipe = false;
	}
	
	public boolean isOn(){
		return OnOff;
	}
	
	
	
	public void run(){
		//0: non, 1: rain, 2: heavyRain
		int state = sensor.getState();
		
		//wh
		if(state == 0){
			OffSlowWipe();
			OffFastWipe();
		}else if(state == 1){
			OnSlowWipe();
		}else if(state == 2){
			OnFastWipe();
		}
	}
	
	
	
	public void turnOff(){
		setIntervalOff();
		OffSlowWipe();
		OffFastWipe();
	}
	
	public void setEvent(int event){
		sensor.transition(event);
	}
	

	public void setIntervalOn(){
		isIntervalOn = true;
	}
	
	public void setIntervalOff(){
		OnOff = false;
		isIntervalOn = false;
	}
	
	public boolean getIntervalOn(){
		return isIntervalOn;
	}
	
	public void OnSlowWipe(){
		isSlowWipe = true;
	}
	
	public void OffSlowWipe(){
		isSlowWipe = false;
	}
	
	public void OnFastWipe(){
		isFastWipe = true;
	}
	
	public void OffFastWipe(){
		isFastWipe = false;
	}
	
	public boolean getIsSlowWipe(){
		return isSlowWipe;
	}
	
	public boolean getIsFastWipe(){
		return isFastWipe;
	}
}
