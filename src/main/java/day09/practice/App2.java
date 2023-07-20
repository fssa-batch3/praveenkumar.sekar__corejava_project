package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Task2> taskList = new ArrayList<>();
		
		taskList.add(new Task2(1, "Workout", LocalDate.of(2023, 12, 7), 2));
		taskList.add(new Task2(2, "Read", LocalDate.of(2023, 7, 25), 1));
		taskList.add(new Task2(3, "Cook", LocalDate.of(2023, 9, 30), 1));
		taskList.add(new Task2(4, "Jump Rope", LocalDate.of(2023, 12, 7), 0));
		
		
		Collections.sort(taskList, Comparator.comparing(Task2::getDeadline)
				.thenComparing(Task2::getPriority));
		
		for(Task2 tasks : taskList) {
			System.out.println(tasks);
		}
	}

}
