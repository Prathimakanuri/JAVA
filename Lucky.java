import java.util.Scanner;
class Lucky{
     public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     System.out.println("vehicle regsitration number =");
     int number=s.nextInt();
     int target=s.nextInt();
     while(number>10){
     int sum=0;
     while(number>0){
          int digit=number%10;
          sum=sum+digit;
          number=number/10;
     }
     number=sum;
     if(number==target)
        System.out.println("Lucky number");
     else
     System.out.println("Not a Lucky number");
     
     }
}
}
