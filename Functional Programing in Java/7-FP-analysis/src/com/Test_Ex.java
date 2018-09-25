package com;

import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Stream;

import com.model.Employee;
import com.util.Timer;

class SalaryAccumaulator {

	double total = 0;

	public void accept(Employee e) {
		total += e.getSalary(); // read + increment with new-salary + write
	}

	public synchronized void acceptSync(Employee e) {
		total += e.getSalary(); // read + increment with new-salary + write
	}

	DoubleAdder doubleAdder = new DoubleAdder();

	public void acceptAtomic(Employee e) {
		doubleAdder.add(e.getSalary());
	}

}

public class Test_Ex {

	public static void main(String[] args) {

		Employee[] employees = Employee.randomlyGenerate(20_00_00_000); // data_in

		double total = 0.0;
		// ---------------------------------------------------------
		// Imperative Style
		// ---------------------------------------------------------

		System.out.println("statefull & sequential-stream");
		total = Timer.timeIt(Test_Ex::getTotalSalary_1, employees);
		System.out.println(total);

		// ---------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		// ---------------------------------------------------------

		System.out.println("statefull  & parallel-stream  (no sync )");
		total = Timer.timeIt(Test_Ex::getTotalSalary_2, employees);
		System.out.println("Total salary: " + total);

		// ---------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		// ---------------------------------------------------------

		System.out.println("statefull  & parallel-stream  (sync )");
		total = Timer.timeIt(Test_Ex::getTotalSalary_3, employees);
		System.out.println("Total salary: " + total);

		// --------------------------------------------------------

		// ---------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		// ---------------------------------------------------------

		System.out.println("statefull  & parallel-stream  (no sync , atomic )");
		total = Timer.timeIt(Test_Ex::getTotalSalary_4, employees);
		System.out.println("Total salary: " + total);

		// --------------------------------------------------------

		System.out.println("=========================================================");

		// ---------------------------------------------------------
		// Functional Style
		// ---------------------------------------------------------

		System.out.println();
		//
		System.out.println("Staless & sequential-stream");
		total = Timer.timeIt(Test_Ex::getTotalSalary5, employees);
		System.out.println("Total salary: " + total);

		// ---------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		// ---------------------------------------------------------

		System.out.println("Staless & parralell-stream");
		total = Timer.timeIt(Test_Ex::getTotalSalary6, employees);
		System.out.println("Total salary: " + total);

	}

	private static double getTotalSalary_1(Employee[] employees) {
		SalaryAccumaulator salaryAcc = new SalaryAccumaulator();
		Stream.of(employees).forEach(e -> salaryAcc.accept(e));
		return salaryAcc.total;
	}

	private static double getTotalSalary_2(Employee[] employees) {
		SalaryAccumaulator salaryAcc = new SalaryAccumaulator();
		Stream.of(employees).parallel().forEach(e -> salaryAcc.accept(e));
		return salaryAcc.total;
	}

	private static double getTotalSalary_3(Employee[] employees) {
		SalaryAccumaulator salaryAcc = new SalaryAccumaulator();
		Stream.of(employees).parallel().forEach(e -> salaryAcc.acceptSync(e));
		return salaryAcc.total;
	}

	private static double getTotalSalary_4(Employee[] employees) {
		SalaryAccumaulator salaryAcc = new SalaryAccumaulator();
		Stream.of(employees).parallel().forEach(e -> salaryAcc.acceptAtomic(e));
		return salaryAcc.doubleAdder.doubleValue();
	}

	private static double getTotalSalary5(Employee[] employees) {
		return Stream.of(employees).mapToDouble(Employee::getSalary).sum();
	}

	private static double getTotalSalary6(Employee[] employees) {
		return Stream.of(employees)
				.parallel()
				.mapToDouble(Employee::getSalary)
				.sum();
	}
}
