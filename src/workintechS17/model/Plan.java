package workintechS17.model;

public enum Plan {
    BASIC("BASIC",8000),
    PREMIUM("PREMIUM",14000),
    FAMILYBASIC("FAMILYBASIC", 6000),
    FAMILYPREMIUM("FAMILYPREMIUM", 11000);

    private String insuranceName;
    private int planPrice;

    Plan(String insuranceName,int planPrice ){
        this.insuranceName=insuranceName;
        this.planPrice=planPrice;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public int getPlanPrice() {
        return planPrice;
    }
}
