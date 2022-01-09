package scope_static;

public class VariableScopeExam {
	int globalScope = 10;	//인스턴스 변수
	static int staticVal = 7;	//클래스변수
		
	public void scopeTest(int value) {
		int localScope = 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);	
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);	
		System.out.println(value2);
	}
	
	
	public static void main(String[] args) {
//		모든 클래스는 인스턴스화하지 않은 채로 사용할 수 없다.
//		키워드 static을 사용하면 인스턴스화 하지 않아도 사용가능
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScopeExam.staticVal);
	}

}
