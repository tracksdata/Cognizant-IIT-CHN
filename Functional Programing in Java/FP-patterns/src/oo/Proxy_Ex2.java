package oo;

public class Proxy_Ex2 {

	public static int executeImperativeSquareSolution(int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// Perform computation
			result = value * value;
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.print("Duration: " + duration + " - ");
		return result;
	}

	public static int executeImperativeCubeSolution(int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// Perform computation
			result = value * value * value;
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

		System.out.println(executeImperativeSquareSolution(5));
		System.out.println(executeImperativeCubeSolution(5));

	}

}
