
public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", FinalGrade());
	}

	public void StudentCondition() {
		if (FinalGrade() >= 60) {
			System.out.println("PASS!");
		}
		else {
			System.out.println("FAILED");
			double missing = 60 - FinalGrade();
			System.out.printf("MISSING %.2f POINTS", missing);
		}

	}
}
