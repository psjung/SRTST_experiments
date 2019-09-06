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

		
		display_done(order);
		skip_ringstone(order);
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
		if(order.getDrink() instanceof Coffee){
			if(order.isSugar()){
				System.out.println("Cpffee with sugar is served.");
			}else{
				System.out.println("Cpffee with no_sugar is served.");
			}
		}
	}
	
	public void skip_ringstone(DrinkOrder order){
		order.ring();
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
