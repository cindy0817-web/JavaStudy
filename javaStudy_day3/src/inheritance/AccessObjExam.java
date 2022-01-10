package inheritance;

import modifier.AccessObj;

public class AccessObjExam extends AccessObj{

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p);	//public
		System.out.println(obj.p2);	//protected 상속 받아서 허용 됨
//		System.out.println(obj.k);	//default
//		System.out.println(obj.i);	// private (실행x)

	}

}
