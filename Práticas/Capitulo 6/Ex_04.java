class Ex_04{
	public static void main(String [] args){
		System.out.format("%4d", 234);	//guardou um 4 espacos para meter o numero 234 
		System.out.format("%5d", 234);
		System.out.format("%s", "\n");
		System.out.format("$%6.2f", 23.456);
		System.out.format("%s", "\n");
		System.out.format("%1%3d+%1$3d=%2$5d", 5, (5+5));
	}
}
