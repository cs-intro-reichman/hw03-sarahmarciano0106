public class Calendar {    
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     
    static int nDaysInMonth = 31; 
    
   
    public static void main(String args[]) {
        
        int debugDaysCounter = 0; 
        int givenyear = Integer.parseInt(args[0]);


        
        while (year < givenyear) {      
            
            advance();
            debugDaysCounter++;
               

            } 
             int stop = ()
            if (debugDaysCounter == 20 ) { 
                break;
            }
        
        while (year == givenyear) {       
            if (dayOfWeek == 1) {
            
                System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday"); 
            }
    
            else {
                System.out.println(dayOfMonth + "/" + month + "/" + year); 
            }
            
            advance();
            debugDaysCounter++;
               

        }
            
             int stop = ()
            if (debugDaysCounter == 20 ) { 
                break;
            }  
    }
  
    
    
     
     private static void advance() {

        dayOfMonth ++;
        dayOfWeek ++; 
        if (dayOfWeek > 7){
            dayOfWeek = 1; 
        }
        if (dayOfMonth > nDaysInMonth(month, year)){
            month ++; 
            dayOfMonth = 1; 
            if (month > 12){
                year ++;
                month = 1;  
            }
        }
        
        
     } 
         
    private static boolean isLeapYear(int year) {
        if ((year%4 == 0 && year%100!= 0) || (year % 400 == 0)) {
            return true;
        }
       
        return false;
    }
     
    
    private static int nDaysInMonth(int month, int year) {
        if ((month == 4) || (month == 6) || (month == 11) || (month == 9)){

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
