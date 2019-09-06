
public class DrinkOrder {
	private final Beverages drinkType; 
	private RingTone ringtone;
	private boolean sugar;
	private boolean milk; 
	private Size size;

	public DrinkOrder(Beverages drinkType) { 
		this.drinkType = drinkType;
		sugar = false; 
		milk = false;
		setSize(1);
	} 

	public DrinkOrder(Beverages drinkType, boolean sugar, int size) { 
		this.drinkType = drinkType; 
		this.sugar = sugar; 
		milk = false;
		setSize(size);
	} 

	public void setSize(int size){
		if(size == 1){
			this.size.setSize("Small");
		}else if(size == 2){
			this.size.setSize("Regular");
		}else if(size == 3){
			this.size.setSize("Large");
		}
	}
	
	public Size getSize(){
		return size;
	}
	
	public boolean isSugar(){
		return sugar;
	}
	
	public void setSugar(boolean sugar){
		this.sugar = sugar;
	}

	public Beverages getDrink(){
		return drinkType;
	}
	
	public void setMilk(boolean milk){
		this.milk = milk;
	}
	
	public boolean getMilk(){
		return milk;
	}
	
	public Beverages OrderType(){ 
		return drinkType; 
	}
	
	public void setRing(){
		ringtone.setRing(true);
	}
	
	public void ring(){
		ringtone.ring();
	}

	public void init(){
		sugar = false;
		milk = false; 
		ringtone.init();
	}
	

}
