package fp;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Proxy_Ex {

	public static void main(String[] args) {

//		Function<String, String> security = s -> s + "-secirty";
//		Function<String, String> trainig = s -> s + "-training";
//
//		Function<String, String> function = trainig.compose(security);
//
//		String ret = function.apply("java");
//		System.out.println(ret);

		Consumer<String> logger = s -> System.out.println("log : -" + s);

		Function<String, Integer> parser = s -> {
			System.out.println("parsing " + s);
			return Integer.parseInt(s);
		};

		BiFunction<Function<String, Integer>, Consumer<String>, Function<String, Integer>> parserWithLog = (p, l) -> {
			return s -> {
				l.accept(s); // logger
				return p.apply(s); // parser
			};
		};

		Function<String, Integer> proxy = parserWithLog.apply(parser, logger);

		int i = proxy.apply("123");
		System.out.println("o/p" + i);

	}

}
