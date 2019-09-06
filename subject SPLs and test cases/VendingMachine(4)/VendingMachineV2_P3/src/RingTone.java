
public class RingTone {
	private boolean onOff;
	
	public RingTone(){
		onOff = false;
	}
	
	public boolean isRing(){
		return onOff;
	}
	
	public void setRing(boolean set){
		onOff = set;
	}
	
	public void ring(){
		if(onOff == true){
			System.out.println("Ringing !!");
		}
	}
	
	public void init(){
		onOff = false;
	}
}
