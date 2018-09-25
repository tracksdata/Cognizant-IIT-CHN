package com;

class LT {
	void eat() {
		System.out.println("LT eat()");
	}

	void sleep() {
		System.out.println("Lt sleep");
	}

	void work() {
		System.out.println("LT work");
	}
}

class Human extends LT {
	public void study() {
		System.out.println("Human study");
	}

	@Override
	void work() {
		System.out.println("Human work");
	}
}

class Animal extends LT {

}

class Robot extends LT {
	@Override
	void eat() {
		System.out.println("robot eat");
	}

	@Override
	void work() {
		System.out.println("robot work..");
	}
}

//-----------------------------------------

class God {
//	public void manageHuman(Human human) {
//		human.eat();
//		human.sleep();
//		human.study();
//		human.work();
//	}
//
//	public void manageAnimal(Animal animal) {
//		animal.eat();
//		animal.sleep();
//		animal.work();
//	}

	public void manageLT(LT lt) {
		lt.eat();
		lt.sleep();
		if (lt instanceof Human) {
			Human human = (Human) lt;
			human.study();
		}
		lt.work();
	}

}

//-----------------------------------------

public class Casting_Ex2 {

	public static void main(String[] args) {

		God god = new God();

		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);

	}

}
