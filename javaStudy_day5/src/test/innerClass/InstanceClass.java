package test.innerClass;

public class InstanceClass {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InstanceClass t = new InstanceClass();
		InstanceClass.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
