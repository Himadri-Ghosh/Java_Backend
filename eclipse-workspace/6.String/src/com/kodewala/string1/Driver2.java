package com.kodewala.string1;

class User {
	String name;

	User(String _name) {
		super();
		this.name = _name;
	}
}
public class Driver2 {
	public static void main(String[] args) {
		String city1 = "Banglore";

		String city2 = "Banglore";

		String city3 = "Banglore";

		String city4 = "Banglore";

//		System.out.println(city1 == city2);

		System.out.println(city1.equals(city2));

		User user1 = new User("Rohit");
		User user2 = new User("Rohit");

		System.out.println(user1.equals(user2));
	}

}
