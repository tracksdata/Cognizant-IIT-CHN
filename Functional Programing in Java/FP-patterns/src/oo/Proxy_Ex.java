package oo;

class TrainingFloor {
	public void doTrainingInRoom1() {
		System.out.println("training on java");
	}

	public void doTrainingInRoom2() {
		System.out.println("training on js");
	}
}

class Security {
	public void doSec() {
		System.out.println("security check");
	}
}

class Logger {
	public void doLog() {
		System.out.println("do log");
	}
}

class TrainingFloorProxy extends TrainingFloor {

	Security sec = new Security();
	Logger logger = new Logger();

	@Override
	public void doTrainingInRoom1() {
		sec.doSec();
		logger.doLog();
		super.doTrainingInRoom1();
		logger.doLog();
	}

	@Override
	public void doTrainingInRoom2() {
		logger.doLog();
		super.doTrainingInRoom2();
		logger.doLog();
	}
}

public class Proxy_Ex {

	public static void main(String[] args) {

		TrainingFloorProxy trainingFloorProxy = new TrainingFloorProxy();
		trainingFloorProxy.doTrainingInRoom1();
		System.out.println();
		trainingFloorProxy.doTrainingInRoom2();

	}

}
