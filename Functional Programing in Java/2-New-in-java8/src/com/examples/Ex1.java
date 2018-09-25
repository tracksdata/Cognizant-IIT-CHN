package com.examples;

interface Scalable {
	// implicitly public static final
	double DEFAULT_SCALE = 1.0;

	// implicitly public abstract
	void setScale(double scale);

	// implicitly public
	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}

	// implicitly public
	static boolean isScalable(Object obj) {
		return obj instanceof Scalable;
	}
}

class Box1 implements Scalable {
	@Override
	public void setScale(double scale) {
		//
	}
}

class Box2 implements Scalable {
	@Override
	public void setScale(double scale) {
		// ..
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Box1 box1 = new Box1();
		box1.resetScale();

		System.out.println(Scalable.isScalable(box1));

	}

}
