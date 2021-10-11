package RunLambda;

public class RunIntLambdaEx {
	public static void main(String args[]) {
		Runnable r =()->{
				for(int i=0;i<5;i++) {
					System.out.println("Thread Child 1");
				}
			};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Thread Main 2");
		}
	}
}
