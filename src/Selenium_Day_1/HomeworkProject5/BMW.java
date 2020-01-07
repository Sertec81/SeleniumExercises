package Selenium_Day_1.HomeworkProject5;

import java.text.DecimalFormat;

public class BMW extends carLease implements carInterface {

    /*
    get the connection with carLease and Car_Interface
    after the connection you should have constructor, Lease_MonthlyCalculator method is _aligable method
*/

    public BMW(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, int depractionAmount, double taxRate, double moneyFactor) {
        super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, depractionAmount, taxRate, moneyFactor);
    }

    /*
    LeaseMonthly Calculater ---> return type is String
    calculation is---> calculateDepreciation + calculateInterest + taxes( these method are coming from the carLease method)
    hint: after the calculation result will be 2.1122211 you need yo change result as a 2.11


 */
   @Override
    public String LeaseMonthlyCalculater() {
        double result = calculateDepreciation() + calculateInterest() + taxes();
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedResult = df.format(result);
        //String.format("%.2f", result); // another format to return the string
        return formattedResult;
   }

/*
        is Aligable
        if the salary is more then bmwMinIncome then true else false
 */
        public boolean isAligable(){
            if(getSalary()> bmwMinIncome){
                return true;
            }
            return false;
        }
            /*
        method name is totalCalculator
        return type is String
        calculation: (LeaseMonthlyCalculater* termofLease) + documentationFees
        you need yo change to double
        hint: after the calculation result result will be 2.1122211 you need to change result as a 2.11
        */
         String totalCalculator(){
            double result = (Double.valueOf(LeaseMonthlyCalculater())*termofLease) + documentationFees;
             DecimalFormat df = new DecimalFormat("0.00");
             String formattedResult = df.format(result);
             return formattedResult;
        }


    }

