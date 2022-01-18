package config;

public class BaseClass {

	public BaseClass() {
		System.out.println("Default Constructor");
	}

	public void sum() {
		System.out.println("Sum");

	}

	public static void main(String[] args) {
		System.out.println("Gitpractice BaseClass");
		BaseClass b = new BaseClass();
		b.sum();

	}

}
