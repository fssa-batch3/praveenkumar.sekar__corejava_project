package day02.practice;

public class App {

	public static void main(String[] args) {
		
		User user1 = new User();
		
		user1.setName("Praveen");
		user1.setEmail("Praveen@gmail.com");
		user1.setId(123);
		user1.setPassword("qwertyuiop123");
		
		user1.getEmail();
		
		Logger logger1 = new Logger();
		
		logger1.debug("Hello");
		logger1.debug(1234);
		logger1.error("hi");
		
	}

}
