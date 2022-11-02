import java.util.Scanner;
class Ex3_13{

 public static double montante(double P, double R, double N){
   //double fra=R/100+1;
   
   return Math.pow(R/100+1,N)*P;
 }
 public static void main(String args[]){
   Scanner s= new Scanner(System.in);
   
   System.out.println("Valor de P:");
   double P= s.nextDouble();
   System.out.println("Valor de R:");
   double R= s.nextDouble();
   System.out.println("Valor de N:");
   double N= s.nextDouble();
   
   s.close();
   
   double f= montante(P,R,N);
   
   System.out.println("Montante ganho apos "+N+" anos: "+ f);
   
  }
} 
