package Selenium_Day_1.HomeworkProject5;

public abstract class carLease {
    /*
    create 2 string (name,whichModel)

    7 int (age,salary,totalCost, downpayment, termofLease, LeaseFee, depractionAmount)

    3 double(taxRate,moneyFactor, interestAmount)
*/

    String name;

    String whichModel;

    int age;

    int salary;

    int totalCost;

    int downPayment;

    int termofLease;

    int leaseFee;

    int depractionAmount;

    double taxRate;

    double moneyFactor;

    double interestAmount;

    /*
        Create a contsructor
        All the  variables should be as a parameter except(depractionAmount and interestAmount)
        deprectionAmount = calculateDepreciation method(you will create this in this class)
        interestAmount = calculateInterest method(you will create this in this class)
 */




    public carLease(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor, double factor) {
        this.name = name;

        this.whichModel = whichModel;

        this.age = age;

        this.salary =salary;

        this.totalCost=totalCost;

        this.downPayment=downPayment;

        this.termofLease=termofLease;

        this.leaseFee=leaseFee;

        this.taxRate=taxRate;

        this.moneyFactor = moneyFactor;

        depractionAmount = calculateDepreciation();

        interestAmount = calculateInterest();
    }


     /*
      create a method

        calculateDepreciation

         return type should be int
         calculate is:
         total cost minus down payment divide by term of lease
        */

        int calculateDepreciation(){

            return  (totalCost - downPayment) / termofLease;

        }

        /*
              calculateInterest

             return type should be double
            calculation is: total cost plus down payment multiply by money factor
        */

         public double calculateInterest(){
            double s =  (totalCost + downPayment) * moneyFactor;

            return s ; //TODO : check this
        }
        /*
        taxes
        return type should be double

        calculation is: depractionAmount + interestAmount*taxRate
         */
        public double taxes(){

            return depractionAmount + (interestAmount * taxRate);
        }
            /*
            getter for the (getSalary)
             */
        public int getSalary() {
            return salary;
        }



    }














