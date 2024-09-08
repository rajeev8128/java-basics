import java.util.Scanner;

public class Phone_bill_calculator {

    public double bill_calculator(float planfee,float overage_min) {

        double final_amt = planfee + (overage_min * 0.25) + (((planfee + (overage_min * 0.25)) * 15) / 100);

        return final_amt;
    }

public static void main(String args[]){

        Phone_bill_calculator  test = new Phone_bill_calculator();
        float base_plan,over_mins;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter base cost of the plan :");
    base_plan = in.nextFloat();
    System.out.println("Enter overage minutes : ");
    over_mins = in.nextFloat();
        double result = test.bill_calculator(base_plan,over_mins);
        System.out.println("------------------------------------------------------");
        System.out.println("Base plan : "+base_plan);
        System.out.println("Overpay mins : "+over_mins);
        System.out.println("Total tax Applied : "+((base_plan+over_mins)*15)/100);
        System.out.println("Total Amount:"+result);

    }

}
