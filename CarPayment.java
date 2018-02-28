package quiz2Vermont;

public class CarPayment {
	
	private double total, downPayment, length, interest;

	public CarPayment(double total, double downPayment, double length, double interest) {
		super();
		this.total = total;
		this.downPayment = downPayment;
		this.length = length;
		this.interest = interest/100;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public double monthlyPayment() {
		double principal = total - downPayment;
		double monthlyInterest = interest/12;
		double m = Math.pow(monthlyInterest + 1, length);
		double monthlyPayment = principal * ((monthlyInterest * m)/(m - 1));
		return monthlyPayment;
	}
	
	public double totalInterest() {
		double monthly = monthlyPayment();
		double principal = total - downPayment;
		double totalValue = length * monthly;
		double totalInterest = totalValue - principal;
		return totalInterest;
	}

}
