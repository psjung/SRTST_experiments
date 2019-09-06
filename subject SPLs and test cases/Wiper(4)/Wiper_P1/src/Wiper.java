public class Wiper {
	private Sensor sensor;
	
	private boolean isIntervalOn;
	private boolean isManualOn;
	private boolean isSlowWipe;
	private boolean isPermanantWipe;
	private boolean OnOff;
	
	
	public Wiper(){
		sensor = new Sensor();
		OnOff = false;
		isIntervalOn = false;
		isManualOn = false;
		isSlowWipe = false;
	}
	
	public boolean isOn(){
		return OnOff;
	}
	
	
	
	public void run(){
		//0: non, 1: rain, 2: heavyRain
		int state = sensor.getState();
		
		//wl
		if(state == 0){
			OffSlowWipe();
		}else if(state == 1 || state == 2){
			OnSlowWipe();
		}

	}
	
	
	
	public void turnOff(){
		setIntervalOff();
		setManualOff();
		OffSlowWipe();
	}
	
	public void setEvent(int event){
		sensor.transition(event);
	}
	
	public void setManualOn(){
		isManualOn = true;
	}
	
	public void setManualOff(){
		isManualOn = false;
	}
	
	public boolean getManualOn(){
		return isManualOn;
	}
	
	public void setPermanantWipe(){
		isPermanantWipe = true;
	}
	
	public boolean getPermanantWipe(){
		return isPermanantWipe;
	}
	
	public void setIntervalOn(){
		isIntervalOn = true;
		isPermanantWipe = false;
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

	
	public boolean getIsSlowWipe(){
		return isSlowWipe;
	}
}
