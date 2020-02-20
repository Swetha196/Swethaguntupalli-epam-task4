import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal=o.nextDouble();
        System.out.println("Enter time");
        double time=o.nextDouble();
        System.out.println("Enter rate_of_interest");
        double rate_of_interest=o.nextDouble();
        System.out.println("Is automated ?");
        boolean automated=o.nextBoolean();
        System.out.println("Enter material");
        String material=o.next();
        System.out.println("Enter area");
        double area=o.nextDouble();

        sim_in si =new sim_in(principal,time,rate_of_interest);
        double simple_interest=si.cali();
        System.out.println("Simple Interest : "+simple_interest);

        com_in co =new com_in(principal,time,rate_of_interest);
        double compound_interest=co.calc();
        System.out.println("Compound Interest : "+compound_interest);

        Construction cons =new Construction(automated,material,area);
        double cost=cons.construct();
        System.out.println("Total Cost : "+cost);
    }
}