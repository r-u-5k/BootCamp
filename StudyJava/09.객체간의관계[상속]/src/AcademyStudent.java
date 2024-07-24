
public class AcademyStudent extends AcademyMember {
	/*
	public class AcademyMember {
	public int no; // 번호
	public String name; // 이름

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
	 */
	
	public String ban;
	
	public AcademyStudent(int no, String name, String ban) {
		this.no = no;
		this.name = name;
		this.ban = ban;
	}
	
	public void studentPrint() {
		this.print();
		System.out.println(this.ban);
	}
	
	public AcademyStudent() {
		
	}
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
}
