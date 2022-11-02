class Ex3_1{
 public static void main(String args[]){
  int i = 3, j = 4, k = 5;
  float x = 34.5f, y = 1225f;
  
  System.out.println((x + 1.5) / (250.1 * (i/j)));	//impossivel pois dá infinito
  System.out.println(x + 1.5 / 250.0 * i / j);		//34.5045
  System.out.println(-x * -y * (i + j) / k);		//59167.5
  System.out.println((i / 5) * y);			//0.0
  System.out.println(Math.min(i, Math.min(j, k)));	//3
  //System.out.println(Math.exp(3,2));			//so receb um valor
  System.out.println(y % x);				//17.5
  System.out.println(Math.pow(3, 2));			//9.0		
  System.out.println((int)y % k);			//0
  System.out.println(i / 5 * y);			//0.0
  }
}  
