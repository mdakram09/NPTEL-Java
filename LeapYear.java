class LeapYear{
    public static void main(String args[]){
    int year = 1900;
    if(year % 100 == 0){
    if(year % 400 == 0)
    System.out.print(year + " is a leap year");
    else
    System.out.print(year + " is not a leap year");
    }
    else if(year % 4 == 0)
    System.out.print(year + " is a leap year");
    else
    System.out.print(year + " is not a leap year");
    }
    }
    