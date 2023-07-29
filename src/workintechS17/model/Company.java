package workintechS17.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developersNames){
        this.id=id;
        this.name = name;
        giroCheck(giro);
        this.developerNames=developersNames;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGiro() {
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    private void giroCheck(double giro){
        this.giro=giro<0?0:giro;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili indexte developer mevcut.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }
    public String toString(){
        return "Name: " + name + " Giro: " + giro + " developers: " + Arrays.toString(developerNames);
    }
}
