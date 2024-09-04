package example;

public class MethodRefrence2 {

	public static void test() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is comgin from the chiild !!! " + i);
		}
	}
	
	public static void  test2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is comgin from the chiild@2 !!! " + i);
		}
	}

	public static void main(String[] args) {

		Runnable runable = MethodRefrence2::test; // this is good with static method
		Thread th = new Thread(runable);
		th.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is comgin from the parent  !!! " + i);
		}
		
		MethodRefrence2 m =  new MethodRefrence2();
		Runnable runobj2  =  m::test2();
		
	}
}
