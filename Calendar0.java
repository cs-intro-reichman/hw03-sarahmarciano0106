
public class Calendar0 {

    public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);
        isLeapYearTest(year);
        nDaysInMonthTest(year);
    }

    private static void isLeapYearTest(int year) {
        String commonOrLeap = "common";
        if (isLeapYear(year)) {
            commonOrLeap = "leap";
        }
        System.out.println(year + " is a " + commonOrLeap + " year");
    }

    private static void nDaysInMonthTest(int year) {
        for (int i =1; i<=12; i++){
            System.out.println("Month " + i + " has " + nDaysInMonth(i, year) +  " days");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year%4 == 0 && year%100!= 0) || (year % 400 == 0)) {
            return true;
        }
        return false;

    }

    public static int nDaysInMonth(int month, int year) {
        if ((month == 4) || (month == 6) || (month == 11)|| (month == 9)){

           return 30;
        }
        else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
            else {
                return 28;
            }
        } 
        return 31;
    
    }
}
