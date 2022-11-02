import java.util.Scanner;

class tabela{
	public static void tabulate(int start,int end,int linelength){
		for(int i=1;i<=end - start +1;i++){
			
			if(i%linelength==0){
				System.out.println(i + start-1);
			}
			else
			System.out.print(i+start-1+" ");
			
				
		}
		
	}
	
	public static void tabulateprof(int start,int end,int linelength){
		int s=0;
		for(int u=start;u<=end;u++){
			System.out.format("%2d ", u);
			s++;
			if(s%linelength==0)System.out.println();
		}
		
	}
	
	public static void main(String []args){
		Scanner s= new Scanner(System.in);
		
		System.out.print("Inicio: ");
		int inicio= s.nextInt();
		System.out.print("Fim: ");
		int fim= s.nextInt();
		System.out.print("Tamanho: ");
		int tamanho= s.nextInt();
		
		s.close();
		System.out.println("");
		
		tabulate(inicio,fim,tamanho);
		
		
	}
}
