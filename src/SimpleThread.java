public class SimpleThread implements Runnable{

	public SimpleThread (String yolo) {
		mString = yolo;
	}

	public void run() {
		for (int i = 0; i <= mRepetitions; i++) {
			System.out.println(i + " " + mString);
			if (i == 9) {
				System.out.println("DONE! " + mString);
				break;
			}
			if (i < 5)
				try {
					Thread.sleep((long)Math.random() * 10);;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			else
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	public void start() {
		Thread t = new Thread(this);
		t.start();
	}
	
	private String mString;
	private static final int mRepetitions = 9;
}
