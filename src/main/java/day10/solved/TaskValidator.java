package day10.solved;

class TaskValidator {
	public static boolean validate(Task task) throws ValidationException {
		if (task == null)
			throw new ValidationException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new ValidationException("Task name is empty");
			return true;
	}
}
