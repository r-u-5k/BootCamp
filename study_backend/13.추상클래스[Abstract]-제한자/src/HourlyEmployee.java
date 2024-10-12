
public class HourlyEmployee extends Employee {
	
	private int worksHour; // 일한 시간
	private int payPerHour; // 시급
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}
	
	@Override
	public void calculatePay() {
		int tempPay = this.worksHour * this.payPerHour;
		this.setPay(tempPay);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.worksHour + "\t" + this.payPerHour);
	}

	public int getWorksHour() {
		return worksHour;
	}

	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
	
}
