package modifier;

public class AccessObj {
	
//	public : 전체 다 사용 가능
	public int p = 3;
	
//	protected : 같은 패키지 허용 & 다른 패키지라도 상속받은 경우 허용
	protected int p2 = 4;
	
//	private : 자기 자신만 접근 가능
	private int i = 1;
	
//	default : 자기 자신과 같은 패키지 내에서 접근 허용
	int k = 2;
}
