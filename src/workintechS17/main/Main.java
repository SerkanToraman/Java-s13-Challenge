package workintechS17.main;

import workintechS17.model.Company;
import workintechS17.model.Employee;
import workintechS17.model.Healthplan;
import workintechS17.model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "AXA", Plan.FAMILYBASIC);
        Healthplan plan2 = new Healthplan(1, "AnadoluHayat", Plan.PREMIUM);
        Healthplan plan3 = new Healthplan(1, "AXA", Plan.BASIC);
        Healthplan plan4 = new Healthplan(1, "AnadoluHayat", Plan.BASIC);
        System.out.println(plan1.getHealthPlanName());
        System.out.println(plan1.getPlan().getPlanPrice());

        String[] healthPlans = new String[3];
        healthPlans[0]=plan1.getHealthPlanName();

        Employee developer1 =new Employee(1,"Serkan","serkan_toraman@hotmail.com","12345678",healthPlans);
        developer1.addHealthPlan(1,plan2.getHealthPlanName());
        System.out.println(developer1);

        Employee developer2 = new Employee(1,"Aytac","aytac_sahin@hotmail.com","12345678",healthPlans);
        developer2.addHealthPlan(2,plan3.getHealthPlanName());
        System.out.println(developer2);

        String[] developerNames = new String[4];
        developerNames[0] = developer1.getFullName();
        Company company = new Company(1, "Workintech", 100000, developerNames);
        company.addEmployee(1, developer2.getFullName());

        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
