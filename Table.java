import java.util.Scanner;
class Table{
      public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int i;
         for(i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
          }
       }
 }
