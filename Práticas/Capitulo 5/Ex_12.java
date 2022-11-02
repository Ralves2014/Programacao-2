class Ex_12{
	public static void bissexto(int ano){
		if(ano%4==0 && ano%100!=0 || ano%400==0)System.out.println("É um ano bissexto.");
		else
			System.out.println("Não é um ano bissexto.");
	}
	
	public static void main(String [] args){
		int y=2000;
		
		bissexto(y);
	}
}
