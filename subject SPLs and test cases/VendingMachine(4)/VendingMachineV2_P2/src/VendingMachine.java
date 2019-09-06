public class VendingMachine {
	private boolean isSkip_ringtone;
	private boolean isCup_taken;
	
	public VendingMachine(){
		isSkip_ringtone = false;
		isCup_taken = false;
	}
	
	public void makeDrink(DrinkOrder order){
		if(order.isSugar())
			pour_sugar(order);
		
		order.getDrink().pourDrink();
		
		if(order.getDrink() instanceof Cappuccino){
			pour_milk(order);
		}
		
		display_done(order);
		cup_taken();
		
		initialize(order);
	}
	
	public void pour_sugar(DrinkOrder order){
		order.setSugar(true);
	}
	
	public void pour_milk(DrinkOrder order){
		order.setMilk(true);
	}
	
	public void display_done(DrinkOrder order){
		if(order.getDrink() instanceof Tea){
			if(order.isSugar()){
				System.out.println("Tea with sugar is served.");
			}else{
				System.out.println("Tea with no_sugar is served.");
			}
		}else if(order.getDrink() instanceof Cappuccino){
			if(order.isSugar()){
				System.out.println("Cappuccino with sugar is served.");
			}else{
				System.out.println("Cappuccino with no_sugar is served.");
			}
		}
	}

	
	public void cup_taken(){
		isCup_taken = true;
	}
	
	public void initialize(DrinkOrder order){
		isSkip_ringtone = false;
		isCup_taken = false;
		
		order.init();
	}
}
