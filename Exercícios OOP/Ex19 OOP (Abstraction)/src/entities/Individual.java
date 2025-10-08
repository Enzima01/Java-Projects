package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double total = 0;
		if (super.getAnualIncome() < 20000) {
			total = (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		} else {
			total = (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		}
		return total;
	}
}
