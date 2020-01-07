package Selenium_Day_1.HomeworkProject5;

public interface carInterface {
    /*
    Create  4 int variables variables

        hyundaiMinIncome with value 100000
        toyotaMinInc with value 80000
        bmwMinIncome with value 110000
        documentationFees with value 1000

        Create two Methods-->
        1) return type is String, no parameter,,, name is ---> LeaseMonthlyCalculater

        2) return type is boolean , no parameter,,, name is ----> isAligable

 */

    int hyundaiMinIncome = 100000;

    int  toyotaMinInc =  80000;

    int bmwMinIncome =  110000;

    int documentationFees =  1000;

    String LeaseMonthlyCalculater();

    boolean isAligable();






}
