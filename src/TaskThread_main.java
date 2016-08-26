import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TaskThread_main {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		pool.execute(new TaskThread(0));
		pool.execute(new TaskThread(1));
		pool.execute(new TaskThread(2));
		pool.execute(new TaskThread(3));
		
		pool.shutdown();
			
	}
}