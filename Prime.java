import java.util.Scanner;
class Prime{
     public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int i,j=0;
         for(i=1;i<=n;i++){
            if(n%i==0)
              j++;
          }
         if(j==2)
           System.out.println("prime");
          else
           System.out.println("not prime");
     }
}
