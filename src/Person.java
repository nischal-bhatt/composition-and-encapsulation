
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (age > 0) {
			this.age = age;
			return true;
		}

		return false;
	}

}
