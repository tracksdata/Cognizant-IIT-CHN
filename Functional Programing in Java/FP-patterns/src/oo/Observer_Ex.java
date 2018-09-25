package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class DoorEvent {
	int floor;
	int num;

	public DoorEvent(int floor, int num) {
		super();
		this.floor = floor;
		this.num = num;
	}

	public int getFloor() {
		return floor;
	}

	public int getNum() {
		return num;
	}

}

interface DoorListener {
	void start(DoorEvent event);

	void stop(DoorEvent event);
}

class Door {
	private List<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener doorListener) {
		this.doorListeners.add(doorListener);
	}

	public void removeDorrListener(DoorListener doorListener) {
		this.doorListeners.remove(doorListener);
	}

	public void open() {
		System.out.println("door opened..");
		DoorEvent event = new DoorEvent(3, 6);
		this.doorListeners.stream().forEach(listener -> {
			listener.start(event);
		});
	}

	public void close() {
		System.out.println("door closed..");
		DoorEvent event = new DoorEvent(3, 6);
		this.doorListeners.stream().forEach(listener -> {
			listener.stop(event);
		});
	}
}

class Light implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("Lights ON " + event.floor + ":" + event.num);
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("Lights OFF " + event.floor + ":" + event.num);
	}

}

class AC implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("AC ON " + event.floor + ":" + event.num);
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("AC OFF " + event.floor + ":" + event.num);
	}

}

public class Observer_Ex {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		Light light = new Light();
		AC ac = new AC();

		door.addDoorListener(light);
		door.addDoorListener(ac);

		TimeUnit.SECONDS.sleep(2);
		door.open();
		TimeUnit.SECONDS.sleep(3);
		door.close();

		door.removeDorrListener(ac);

		TimeUnit.SECONDS.sleep(3);
		door.open();

		TimeUnit.SECONDS.sleep(3);
		door.close();

	}

}
