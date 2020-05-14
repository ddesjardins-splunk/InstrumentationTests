package agents.tests;


public class OpenTelemetryTestApm {
	
	void total() throws Exception {
		
		for(int i=0; i<100; i++) {
			System.out.println("Coming...");
			countIt(i);
		}
	}
	
	void start() {
		System.out.println("The Total Count is:");
	}
	

	void countIt(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) throws Exception {
		
		OpenTelemetryTestApm testApm = new OpenTelemetryTestApm();
		testApm.start();
		testApm.total();
		Thread.sleep(5000);	
	}
	
}

