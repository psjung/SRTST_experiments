import org.junit.Test;

public class IntegrationTests {

	@Test
	public void test1() {
		TankManager t = new TankManager();
		t.init();
	}
	
	@Test
	public void test2() {
		TankManager t = new TankManager();
		Tank tank = new Tank(t, 1, 2, 3);
		tank.beschaedigen(0, 0);
	}

	@Test
	public void test3() {
		TankManager t = new TankManager();
		t.toolsLaden();
	}
	
	@Test
	public void test4() {
		TankManager t = new TankManager();
		t.mapLaden();
		t.tanksLaden();
	}
	
	@Test
	public void test5() {
		TankManager t = new TankManager();
		Tank tank = new Tank(t, 3, 1, 2);
		tank.koordinateAktualisieren(1);
	}
	
	@Test
	public void test6(){
		Maler m = new Maler(new TankManager());
		m.helpItemErstellen();
	}
	
	@Test
	public void test7() {
		TankManager t = new TankManager();
		Tank tank = new Tank(t, 3, 1, 2);
		tank.toolBehandeln(0);
	}
	
	@Test
	public void test8() {
		TankManager t = new TankManager();
		Tank tank = new Tank(t, 3, 1, 2);
		tank.toolKontroller();
	}
	
	@Test
	public void test9() {
		TankManager t = new TankManager();
		t.keyPressBehandeln(10);
		t.keyPressBehandeln(27);
		t.keyReleaseBehandeln(10);
		
	}
	
	@Test
	public void test11() {
		TankManager t = new TankManager();
		Tank tank = new Tank(t, 3, 1, 2);
		tank.keyPressBehandeln(38);
		tank.keyPressBehandeln(40);
		tank.keyPressBehandeln(37);
		tank.keyPressBehandeln(39);
		tank.keyPressBehandeln(17);
		
		tank.keyReleaseBehandeln(38);
		tank.keyReleaseBehandeln(40);
		tank.keyReleaseBehandeln(37);
		tank.keyReleaseBehandeln(39);
		tank.keyReleaseBehandeln(17);
		
		tank.tankFeindKI();
	}
	
	@Test
	public void test12(){
		TankManager t = new TankManager();
		Wall w = new Wall(t, 1,2,3,4,5);
		w.stossenGegen(new GameObject());
	}
	
}
