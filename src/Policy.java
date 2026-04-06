import java.util.Objects;

public class Policy {

    private String policyNumber;
    private String clientName;
    private double basePremium;
    private int riskLevel;
    private double vehicleValue;
    private boolean hasAlarm;
    private boolean claimFreeClient;
    private static int createdPolicyCount;
    private static final double ADMINISTRATIVE_FEE = 50.0;

    public Policy(String policyNumber, String clientName, double basePremium, int riskLevel, double vehicleValue, boolean hasAlarm, boolean claimFreeClient) {

        createdPolicyCount++;

        this.policyNumber = policyNumber;

        this.clientName = clientName;

        this.basePremium = basePremium;

        if(riskLevel < 4 && riskLevel > 0) {

            this.riskLevel = riskLevel;

        }

        this.vehicleValue = vehicleValue;

        this.hasAlarm = hasAlarm;

        this.claimFreeClient = claimFreeClient;


    } public String getPolicyNumber() {

        return policyNumber;

    } public String getClientName() {

        return clientName;

    } public double getBasePremium() {

        return basePremium;

    } public int getRiskLevel() {

        return riskLevel;

    } public double getVehicleValue() {

        return vehicleValue;

    } public boolean isHasAlarm() {

        return hasAlarm;

    } public boolean isClaimFreeClient() {

        return claimFreeClient;

    } public double calculateFinalPremium() {

        double finalPremium = basePremium + 10 + ((double) riskLevel * 0.5);

        return finalPremium;

    } public double calculateRenewalPremium() {

        double renewalPremium = basePremium + basePremium * 0.5;
        return renewalPremium;


    } public String getRiskSummary() {

        return switch (riskLevel) {
            case 1:
                yield "(low)";
            case 2:
                yield "(medium)";
            case 3:
                yield "(high)";
            default:
                yield "unknown";

        };


    } public static int getCreatedPolicyCount() {

        return createdPolicyCount;

    }

    @Override
    public String toString() {
        return policyNumber + "\t" + "| Client: " + clientName + " | Base premium: " + basePremium + " PLN" + "\n> Risk level: " + riskLevel + " " + getRiskSummary() + "\n> Vehicle value: " + vehicleValue + " PLN" + "\n> Alarm: " + hasAlarm + "\n> Claim free: " + claimFreeClient + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(policyNumber);
    }

}
