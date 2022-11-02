class Ex3_18{
	public static double equacao1(double a, double b, double c){
		double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		
		return x1;
		
	}
	public static double equacao2(double a, double b, double c){
		double x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		
		return x2;
		
	}
	public static void main(String args[]){
		double A=3, B=5, C=-2;
		
		if(B*B>=4*A*C){
			double f1=equacao1(A,B,C);
			System.out.println(f1);
			double f2=equacao2(A,B,C);
			System.out.println(f2);
		}else
			System.out.println("Inválida");
			
		
	}
}
