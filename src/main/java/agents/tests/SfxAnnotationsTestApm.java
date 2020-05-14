package agents.tests;

import com.signalfx.tracing.api.Trace;

public class SfxAnnotationsTestApm {
	@Trace
	void total() throws Exception {
		
		for(int i=0; i<100; i++) {
			System.out.println("Coming...");
			countIt(i);
		}
	}
	@Trace
	void start() {
		System.out.println("The Total Count is:");
	}
	
	@Trace
	void countIt(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) throws Exception {
		
		SfxAnnotationsTestApm testApm = new SfxAnnotationsTestApm();
		testApm.start();
		testApm.total();
		Thread.sleep(5000);	
	}
}
