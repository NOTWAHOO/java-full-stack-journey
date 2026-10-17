
public class DriverSalesPerson {

	public static void main(String[] args) {
		SalesPerson team[] = { new SalesPerson(201, "Stephen Sabar", 45, 250.0),
				new SalesPerson(202, "Asha Rani", 60, 300.0), new SalesPerson(203, "Akash Roshan", 30, 200.0),
				new SalesPerson(204, "Praveen Kumar", 55, 280.0) };

		SalesPerson topPerformer = team[0];

		for (int i = 1; i < team.length; i++) {
			if (team[i].calculateTotalCommission() > topPerformer.calculateTotalCommission()) {
				topPerformer = team[i];
			}
		}

		System.out.println("--- Top-Performing Salesperson ---");
		topPerformer.displayDetails();
	}

}
