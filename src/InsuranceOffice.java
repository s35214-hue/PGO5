import java.util.ArrayList;

public class InsuranceOffice {

    private String name;
    private ArrayList<Policy> policies = new ArrayList<>();

    public InsuranceOffice(String name) {

        this.name = name;


    } public void addPolicy(Policy policy) {

        if(policy != null) {

            policies.add(policy);

        }


    } public void printReport() {

        System.out.println("\nInsurance Office - " + name);
        System.out.println("Created policy count: " + Policy.getCreatedPolicyCount() + "  |  " + "Total Premium: " + calculateTotalPremium() + " PLN\n");
        System.out.println("Policies:\n");
        for(Policy policy : policies) {

            if (policy != null) {

                System.out.println(policy.toString());

            }
        }


    } public double calculateTotalPremium() {

        double totalPremium = 0;

        for (Policy policy : policies) {

            if (policy != null) {

                totalPremium += policy.calculateFinalPremium();

            }
        } return totalPremium;


    } public int calculateTotalRenewalForecast() {

        int probableRenewal = 0;

        for (Policy policy : policies) {

            if (policy != null) {

                if(policy.getRiskLevel() > 2 || policy.getVehicleValue() > 50000) {

                    probableRenewal++;

                }
            }
        } return probableRenewal;


    } public int countHighRiskPolicies() {

        int highRisk = 0;

        for (Policy policy : policies) {

            if (policy != null) {

                if (policy.getRiskLevel() > 2) {

                    highRisk++;

                }
            }
        }  return highRisk;


    } public void findByNumber (String policyNumber) {

        for (Policy policy : policies) {

            if (policy != null) {

                if (policy.getPolicyNumber().equals(policyNumber)) {

                    System.out.println(policy.toString());

                }
            }
        }


    } public void printCheaperThan (double treshold) {

        for (Policy policy : policies) {

            if (policy != null) {

                if (policy.calculateFinalPremium() < treshold) {

                    System.out.println(policy.toString());

                }
            }
        }


    }



}
