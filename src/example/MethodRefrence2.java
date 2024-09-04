package example;

public class MethodRefrence2 {

	public static void test() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is comgin from the chiild !!! " + i);
		}
	}

	public static void main(String[] args) {

		Runnable runable = MethodRefrence2::test;
		Thread th = new Thread(runable);
		th.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is comgin from the parent  !!! " + i);
		}
	}
}
