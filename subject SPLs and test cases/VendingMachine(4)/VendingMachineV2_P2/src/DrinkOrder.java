
public class DrinkOrder {
	private final Beverages drinkType; 

	private boolean sugar;
	private boolean milk; 


	public DrinkOrder(Beverages drinkType) { 
		this.drinkType = drinkType;
		sugar = false; 
		milk = false;

	} 

	public DrinkOrder(Beverages drinkType, boolean sugar, int size) { 
		this.drinkType = drinkType; 
		this.sugar = sugar; 
		milk = false;

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

	public void init(){
		sugar = false;
		milk = false; 
	}
	

}
