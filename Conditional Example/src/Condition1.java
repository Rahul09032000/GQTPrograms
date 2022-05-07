
public class Condition1 {

	public static void main(String[] args) {
		int age = 27;
		int exp = 4;
		int salary = 12000;
	if (age>=25) {
		if (exp>=3) {
			if (salary <= 25000) {
				salary = salary + 5000;
				System.out.println("salary is Incremental");
				System.out.println("New Salary is " +salary);
			}
			else {
				System.out.println("Your salary is more than 25000");
			}
		}
		else {
			System.out.println("Experience is less than Expected");
		}
	}
	else {
		System.out.println("Your Age is less than 25");
	}

	}

}
