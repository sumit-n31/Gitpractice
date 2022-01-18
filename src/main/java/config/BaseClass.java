package config;

public class BaseClass {
	int x, y;

	public BaseClass(int x, int y) {
		System.out.println("Parameter constructor");
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
