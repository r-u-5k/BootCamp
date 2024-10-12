
public class MemberFieldInitialization {
	/*
	 * 1-1. 인스턴스 멤버 필드는 객체 생성 시 기본값으로 자동 초기화됨
	 */
	public int member1;
	public double member2;
	public char member3;
	public boolean member4;
	public String member5;
	public Order member6;
	
	/*
	 * 1-2. 인스턴스 멤버 필드는 선언 시 설정한 초기값으로 자동 초기화됨
	 */
	
	public int member11 = 999;
	public double member22 = 3.1;
	public char member33 = '힣';
	public boolean member44 = true;
	public String member55 = "화요일";
	public Order member66 = new Order(1111, "자바", "2023-12-10", 20000);
	
	/*
	 * 1-3. 생성자 초기화
	 */
	
	public MemberFieldInitialization() {
	}

	public MemberFieldInitialization(int member1, double member2, char member3, boolean member4, String member5,
			Order member6, int member11, double member22, char member33, boolean member44, String member55,
			Order member66) {
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
		this.member11 = member11;
		this.member22 = member22;
		this.member33 = member33;
		this.member44 = member44;
		this.member55 = member55;
		this.member66 = member66;
	}
	
	
	
	
}
