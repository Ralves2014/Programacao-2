class Ex_09{
	//utilizando o switch
	public static void pot(int n){
		switch(n){
			case 6:System.out.println("Million");
			break;
			case 9:System.out.println("Billion");
			break;
			case 12:System.out.println("Trillion");
			break;
			case 15:System.out.println("Quadrillion");
			break;
			case 18:System.out.println("Quintillion");
			break;
			case 21:System.out.println("Sextillion");
			break;
			case 30:System.out.println("Nonillion");
			break;
			case 100:System.out.println("Googol");
			break;
		}
	}
	//utilizando o if
	public static void pot2(int n){
		if(n==6)
			System.out.println("Million");
		else if(n==9)
			System.out.println("Billion");
		else if(n==12)
			System.out.println("Trillion");
		else if(n==15)
			System.out.println("Quadrillion");
		else if(n==18)
			System.out.println("Quintillion");
		else if(n==21)
			System.out.println("Sextillion");
		else if(n==30)
			System.out.println("Nonillion");
		else if(n==100)
			System.out.println("Googol");
			
	}
	
	public static void main(String [] args){
		int num=15;
		
		pot(num);
		pot2(num);
	}
}
