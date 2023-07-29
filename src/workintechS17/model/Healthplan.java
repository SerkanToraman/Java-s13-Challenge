package workintechS17.model;

public class Healthplan {
    private int id;
    private String healthInsurerName;
    private Plan plan;

    public Healthplan(int id,String healthInsurerName,Plan plan){
        this.id=id;
        this.healthInsurerName=healthInsurerName;
        this.plan=plan;
    }

    public int getId() {
        return id;
    }

    public String getHealthPlanName() {
        return healthInsurerName;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHealthPlanName(String healthPlanName) {
        this.healthInsurerName = healthInsurerName;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public String toString(){
        return "Healthplan = " +"id: " +id +" name: " + healthInsurerName + " plan: "+plan;
    }
}
