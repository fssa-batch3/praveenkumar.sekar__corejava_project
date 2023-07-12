package day03.practice;

public class User {
	private String name;
	private String email;
	private String password;
	
	public User (String name, String email, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
