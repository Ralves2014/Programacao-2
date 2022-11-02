import java.util.Scanner;
class Ex3_24{

 public static double totalPrice(int s, double p){
 	double tp=s*p*5.99;
	double tpwt=tp+tp*0.0725;
		
	return tpwt;
}
 public static void main(String []args){
	Scanner s= new Scanner(System.in);
		
	System.out.print("Número de sacos vendidos: ");
	int sacos= s.nextInt();
	System.out.print("Peso do saco: ");
	double peso=s.nextDouble();
		
	s.close();
		
	System.out.println("Imposto: 5.99 euros");
	System.out.println("Imposto: 7.25%");
		
	double f= totalPrice(sacos,peso);
		
	System.out.println("Preço Total: "+ f+" euros");
 }
}

