package workintechS17.model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password,String[] healthPlans ){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }
    public void addHealthPlan(int index,String insurerName){
        try {
            if(healthPlans[index]==null){
                healthPlans[index]=insurerName;
            }else{
                System.out.println("Ilgili indexde Healthplanı mevcuttur.Lütfen farklı indexe healthplan ekleyiniz");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }
    @Override
    public String toString() {
        return "FullName: " + fullName + " Healthplans: " + Arrays.toString(healthPlans);
    }
}
