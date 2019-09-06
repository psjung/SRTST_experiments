

abstract class Tool$$Tools extends GameObject {
	protected long time;
	protected long currTime;
	protected int tankId;

	public Tool$$Tools(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		init(tankManager, x_Koordinate, y_Koordinate, toolType);
	}

	protected void init(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		((Tool) this).id = ((Tool) this).hashCode();
		time = System.currentTimeMillis();
		currTime = time;
	}

	public void malen() {
		long elapsedTime = System.currentTimeMillis() - currTime;
		currTime += elapsedTime;
		if (tankManager.status == GameManager.PAUSE || tankManager.status == GameManager.EXIT) {
			time += elapsedTime;
		}
		if (System.currentTimeMillis() - time > 15000) {
			tankManager.toolMenge.removeElement(((Tool) this));
		}
		treffenErkennen(); 
		toolMalen();
	}
	
	protected void toolMalen(){
		super.malen();
	}

	protected void treffenErkennen() {
		if (tankManager.tank1 != null && ((Tool) this).stossenGegen(tankManager.tank1)) {
			tankManager.tank1.toolBehandeln(objectType);
			tankId=tankManager.tank1.id;
			remove();
		}
		if (tankManager.tank2 != null && ((Tool) this).stossenGegen(tankManager.tank2)) {
			tankManager.tank2.toolBehandeln(objectType);
			tankId=tankManager.tank2.id;
			remove();
		}
	}
	
	protected void remove(){
		tankManager.toolMenge.removeElement(((Tool) this));
	}
}

abstract class Tool$$Beschleunigung extends  Tool$$Tools  {
	
	protected void init(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		//**Space({TankWar_P3, TankWar_P2}) delete
		super.init(tankManager,x_Koordinate,y_Koordinate,toolType);
		//**Space({TankWar_P3, TankWar_P2}) add
	//	init(tankManager,x_Koordinate,y_Koordinate,toolType);
		switch (toolType) {
		case 370:
			super.init(tankManager, x_Koordinate * tankManager.koernigkeit2, y_Koordinate
					* tankManager.koernigkeit2, 30, 144, 255, tankManager.koernigkeit,
					tankManager.koernigkeit, toolType);
			break;
		}
	}
      // inherited constructors



	public Tool$$Beschleunigung ( TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType ) { super(tankManager, x_Koordinate, y_Koordinate, toolType); }

}

abstract class Tool$$einfrieren extends  Tool$$Beschleunigung  {
	
	protected void init(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		super.init(tankManager, x_Koordinate, y_Koordinate, toolType);
		switch (toolType) {
		case 371:
			super.init(tankManager, x_Koordinate * tankManager.koernigkeit2, y_Koordinate
					* tankManager.koernigkeit2, 100, 149, 237, tankManager.koernigkeit,
					tankManager.koernigkeit, toolType);
			break;
		}
	}
      // inherited constructors



	public Tool$$einfrieren ( TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType ) { super(tankManager, x_Koordinate, y_Koordinate, toolType); }
}

abstract class Tool$$Feuerkraft extends  Tool$$einfrieren  {
	
	protected void init(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		//**Space({TankWar_P3, TankWar_P5, TankWar_P1}) delete
		super.init(tankManager, x_Koordinate, y_Koordinate, toolType);
		switch (toolType) {
		case 372:
			super.init(tankManager, x_Koordinate * tankManager.koernigkeit2, y_Koordinate
					* tankManager.koernigkeit2, 0, 255, 0, tankManager.koernigkeit,
					tankManager.koernigkeit, toolType);
			break;
		}
	}
      // inherited constructors



	public Tool$$Feuerkraft ( TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType ) { super(tankManager, x_Koordinate, y_Koordinate, toolType); }
}

abstract class Tool$$Mars extends  Tool$$Feuerkraft  {

	protected void init(TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType) {
		//**Space({TankWar_P3, TankWar_P2, TankWar_P1}) delete
		super.init(tankManager, x_Koordinate, y_Koordinate, toolType);
		switch (toolType) {
		case 375:
			super.init(tankManager, x_Koordinate * tankManager.koernigkeit2, y_Koordinate
					* tankManager.koernigkeit2, 255, 255, 255, tankManager.koernigkeit,
					tankManager.koernigkeit, toolType);
			break;
		}
	}
      // inherited constructors



	public Tool$$Mars ( TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType ) { super(tankManager, x_Koordinate, y_Koordinate, toolType); }

}

public class Tool extends  Tool$$Mars  {
	
	protected void toolMalen(){
	switch (objectType) {
		case 370:
			tankManager.maler.drawImage("370", x_Koordinate, y_Koordinate);
			break;
		case 371:
			tankManager.maler.drawImage("371", x_Koordinate, y_Koordinate);
			break;
		case 372:
			tankManager.maler.drawImage("372", x_Koordinate, y_Koordinate);
			break;
		case 373:
			tankManager.maler.drawImage("373", x_Koordinate, y_Koordinate);
			break;
		case 374:
			tankManager.maler.drawImage("374", x_Koordinate, y_Koordinate);
			break;
		case 375:
			tankManager.maler.drawImage("375", x_Koordinate, y_Koordinate);
			break;		
		} 
	}
      // inherited constructors



	public Tool ( TankManager tankManager, int x_Koordinate, int y_Koordinate, int toolType ) { super(tankManager, x_Koordinate, y_Koordinate, toolType); }

}