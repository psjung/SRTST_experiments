
public class Sensor {
	private int state;
	
	public Sensor(){
		state = 0;
	}
	
	public int getState(){
		return state;
	}
	
	public void transition(int event){
		//0: non, 1: little, 2: heavy
		
		//sh
		if(event == 0){
			setNonRain();
		}else if(event == 1){
			setLittleRain();
		}else if(event == 2){
			setHeavyRain();
		}
	}
	
	public void setNonRain(){
		state = 0;	//s1
	}
	
	public void setLittleRain(){
		state = 1;	//s2
	}
	
	public void setHeavyRain(){
		state = 2;	//s3
	}
}
