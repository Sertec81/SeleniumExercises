package Selenium_Day_1.HomeworkProject5;
import java.text.DecimalFormat;


    public class Hyundai extends carLease implements carInterface{
        public Hyundai(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, int depractionAmount, double taxRate, double moneyFactor) {
            super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, depractionAmount, taxRate, moneyFactor);
        }

   @Override
   public String LeaseMonthlyCalculater(){
        return null;
        }
    @Override
        public boolean isAligable(){
            return false;

    }
//        public String totalCalculator(){
//            return "a";
//        }

    /*
        get the connection with carLease and carInterface,
        after the connection you should have contsructor, LeaseMonthlyCalculator method and isAligable method
     */
    /*
        LeaseMonthlyCalculator --> return type is String
        calculator is--> calculateDepreciation + calculateInterest + taxes( these methods are coming from the
        hint: after the calculation result result will be 2.1122211 you need to change result as a 2.11
     */
        /*
        isAligable
        if the salary is more then hyundaiMinIncome then true or else false
         */

        /*
        method name is totalCalculator
        return type is String
        calculation: (LeaseMonthlyCalculator* termofLease) + documentationFees
         */
        String totalCalculator() {

            //  change the LeaseMonthlyCalculater to double and make the calculation (parse from string to double in java)
            double result = (Double.valueOf (LeaseMonthlyCalculater()) * termofLease) + documentationFees;

//            parse the result double to String  (parse double to String in java)

            DecimalFormat df = new DecimalFormat("0.00");
            String formattedResult = df.format(result);
            return formattedResult;

        }
    }

