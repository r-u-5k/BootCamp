/*
 * - Academy 구성원들의 공통 속성과 기능을 가지고 있는 부모(super) 클래스
 * - AcademyStudent,AcademyGangsa,AcademyStaff 클래스들이 상속받아 재사용하기 위한 클래스
 */
public class AcademyMember {
	public int no; // 번호
	public String name; // 이름
	
	public AcademyMember() {
		
	}

	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void print() {
		System.out.print(this.no + "\t" + this.name + "\t");
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
