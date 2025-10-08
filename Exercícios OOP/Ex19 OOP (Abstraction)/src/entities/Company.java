package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company() {
	}

	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double total = 0;
		if (numberOfEmployees > 10) {
			total = super.getAnualIncome() * 0.14;
		} else {
			total = super.getAnualIncome() * 0.16;
		}
		return total;
	}
}
