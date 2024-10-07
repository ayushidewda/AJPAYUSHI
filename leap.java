import java.util.*;
class leap{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      System.out.println("enter year");
     int year= sc.nextInt();
     leapYear = (year%4==0);
     leapYear = leapYear && (year%100 != 0 || year%400 == 0)?           
          System.out.println(year+ "year is leap year");:
         System.out.println(year+ "year is not leap year");

}
}
}



