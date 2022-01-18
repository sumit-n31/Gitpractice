package config;

public class BaseClass {
	int x, y;

	public BaseClass(int x, int y) {
		System.out.println("This is constructor");
		System.out.println("Parameter constructor");
	}

	public BaseClass() {
		System.out.println("Default Constructor");
	}

	public void sum() {
		System.out.println("Sum");

	}

	public static void main(String[] args) {
		System.out.println("Gitpractice BaseClass");
		BaseClass b = new BaseClass(0,0);
		b.sum();

	}

}
