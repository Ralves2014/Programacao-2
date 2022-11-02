import java.util.Scanner;
class Ex_02{

	public static void function1(int y){
		int soma=0;
		long produto=1;
		for(int p=1;p<=y;p++){
			soma+=p;
			produto*=p;
		}
		System.out.println("For: Soma: "+soma+" Produto: "+produto);
	}
	
	public static void function2(int y){
		int soma2=0, n=1;
		long produto2=1;
		
		while(n<=y){
			soma2+=n;
			produto2*=n;
			n++;
		}
		
		System.out.println("While: Soma: "+soma2+" Produto: "+produto2);
	}
	
	public static void function3(int y){
		int soma3=0, u=1;
		long produto3=1;
		
		do{
			soma3+=u;
			produto3*=u;
			u++;
		}while(u<=y);
		
		System.out.println("Do While: Soma: "+soma3+" Produto: "+produto3);
	}
	
	public static void main(String []args){
		Scanner s= new Scanner(System.in);
		System.out.println("Insira o fim da contagem ");
		int f=s.nextInt();
		s.close();
		
		function1(f);
		
		function2(f);
		
		function3(f);
	
		
		
	}
}
