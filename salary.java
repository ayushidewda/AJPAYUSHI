import java.util.*;
class salary{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
     int salary = sc.nextInt();
      if(salary>=50000){
      double bonus= 0.10 *salary;
      System.out.println(bonus);
}
else{
    System.out.println("salary not much as 50000");
}


}
}