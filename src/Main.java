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

    }
}
