package fp;

import java.util.function.Function;

public class Factory_Ex {

	public static void main(String[] args) {

		Function<String, String> supplier = type -> {
			if (type.equals("veg"))
				return "curd rice";
			if (type.equals("nonveg"))
				return "biryani";
			return "water-bottle";
		};

	}

}
