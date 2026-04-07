public class Main {
    public static void main(String[] args) {

        InsuranceOffice office = new InsuranceOffice("Jack and Jill Insurance");

        Policy policy1 = new Policy("CAR-001", "Jane Doe", 1000, 1, 20000, false, true);

        Policy policy2 = new Policy("CAR-002", "John Doe", 2000, 2, 51000, true, false);

        Policy policy3 = new Policy("CAR-003", "Aragorn from Lord of the Rings", 500, 3, 10000, false, false);

        office.addPolicy(policy1);
        office.addPolicy(policy2);
        office.addPolicy(policy3);

        office.printReport();
        System.out.println("Total premium: " + office.calculateTotalPremium());
        System.out.println("Total renewal forecast: " + office.calculateTotalRenewalForecast());
        System.out.println("High risk policies: " + office.countHighRiskPolicies());
        System.out.println("Created policy count: " + Policy.getCreatedPolicyCount());

        System.out.println("\nPolicy 1 risk: " + policy1.getRiskSummary());
        //This looks VERY cursed but I had no better idea on how to add PLN to the very end.
        System.out.printf("Renewal forecast for policy 1: %.2f",policy1.calculateRenewalPremium()); System.out.print(" PLN\n");

        System.out.println("\n" + policy1.equals(new Policy("CAR-004", "Jean Dough", 1400.0, 2, 28900.0, true, true)));

        Policy found = office.findByNumber("CAR-002");
        System.out.println("\nFound: \n" + found);


    }
}
