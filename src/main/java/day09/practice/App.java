package day09.practice;
import java.time.LocalDate;
import java.util.*;
public class App {

	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<>();
		
		taskList.add(new Task("Workout", 1, LocalDate.of(2023, 12, 7)));
		taskList.add(new Task("Read", 2, LocalDate.of(2023, 7, 25)));
		taskList.add(new Task("Cook", 3, LocalDate.of(2023, 9, 30)));
		taskList.add(new Task("Jump Rope", 4, LocalDate.of(2023, 11, 7)));
		
		
		Collections.sort(taskList, Comparator.comparing(Task::getDeadline));
		
		for(Task tasks : taskList) {
			System.out.println(tasks);
		}
	}

}
