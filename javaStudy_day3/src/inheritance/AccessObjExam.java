package inheritance;

import modifier.AccessObj;

public class AccessObjExam extends AccessObj{

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p);	//public
		System.out.println(obj.p2);	//protected ��� �޾Ƽ� ��� ��
//		System.out.println(obj.k);	//default
//		System.out.println(obj.i);	// private (����x)

	}

}
