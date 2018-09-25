package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.examples.model.Employee;
import com.examples.model.Gender;

class Todo {
	private int id;
	private String title;
	private boolean completed;

	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}

}

public class Ex7 {
	public static void main(String[] args) {
		
		
		List<Todo> todos=Arrays.asList(
				new Todo(2323, "item-1", true),
				new Todo(3323, "item-2", true),
				new Todo(4346, "item-3", false),
				new Todo(1323, "item-4", true),
				new Todo(6323, "item-5", true),
				new Todo(7323, "item-6", false),
				new Todo(9323, "item-7", true),
				new Todo(5323, "item-8", false),
				new Todo(3323, "item-9", true),
				new Todo(8323, "item-10", false)
				);
		
		//--------------------------------------
		
		
		boolean b=todos
		.stream()
		//.allMatch(todo->todo.isCompleted());
		//.anyMatch(todo->todo.isCompleted());
		.noneMatch(todo->todo.isCompleted());

		System.out.println(b);
		
		
		//--------------------------------------
		Random rand=new Random();
		
		Employee[] employees=Stream.generate(() -> {
				int rn = rand.nextInt(100);
				String name = "ibm-employee-" + rn;
				return new Employee(rn, name, rn * 1000.00, rn + 1, Gender.MALE);
			})
			.limit(100)
//			.toArray(size->new Employee[size]);
			.toArray(Employee[]::new);
		
		
		//--------------------------------------
		IntStream intStream=
				IntStream.range(1, 100);
		
		OptionalInt optionalInt=
				intStream
				//.filter(n->n>200)
				.max();
		
		
		System.out.println(optionalInt.orElse(0));
	}
}

















