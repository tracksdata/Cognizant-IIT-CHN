package fp;

import java.util.function.Function;

public class Proxy_Ex2 {

	public static int executeDuration(Function<Integer, Integer> computation, int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			result = computation.apply(value);
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.print("Duration: " + duration + " - ");
		return result;
	}

	public static void main(String[] args) {

		System.out.println(executeDuration(x -> x * x, 5));
		System.out.println(executeDuration(x -> x * x * x, 5));
		System.out.println(executeDuration(x -> x * 2, 5));
		System.out.println(executeDuration(x -> x * 3, 5));

	}

}
