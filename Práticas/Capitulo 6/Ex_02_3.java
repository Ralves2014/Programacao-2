
class Ex_02{

	public static void function1(double y){
		double soma=0;
		long produto=1;
		for(int p=1;Math.pow(2,p)-1<=y;p++){
			soma+=Math.pow(2,p)-1;
			produto*=Math.pow(2,p)-1;
		}
		System.out.println("For: Soma: "+soma+" Produto: "+produto);
	}
	
	public static void function2(double y){
		double soma2=0, n=1;
		long produto2=1;
		
		while(Math.pow(2,n)-1<=y){
			soma2+=Math.pow(2,n)-1;
			produto2*=Math.pow(2,n)-1;
			n++;
		}
		
		System.out.println("While: Soma: "+soma2+" Produto: "+produto2);
	}
	
	public static void function3(double y){
		double soma3=0, u=1;
		long produto3=1;
		
		do{
			soma3+=Math.pow(2,u)-1;
			produto3*=Math.pow(2,u)-1;
			u++;
		}while(Math.pow(2,u)-1<=y);
		
		System.out.println("Do While: Soma: "+soma3+" Produto: "+produto3);
	}
	
	public static void main(String []args){
		
		System.out.println("Insira o fim da contagem ");
		double f=Math.pow(2,4)-1;
		
		function1(f);
		
		function2(f);
		
		function3(f);
	
		
		
	}
}
