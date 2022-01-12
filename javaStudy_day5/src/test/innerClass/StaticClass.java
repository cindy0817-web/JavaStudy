package test.innerClass;

public class StaticClass {
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String args[]) {
		StaticClass.Cal cal = new StaticClass.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
}
