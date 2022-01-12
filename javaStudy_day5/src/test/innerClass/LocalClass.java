package test.innerClass;

public class LocalClass {
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	public static void main(String[] args) {
		LocalClass t = new LocalClass();
		t.exec();
	}

}
