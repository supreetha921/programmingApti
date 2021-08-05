class Fibonacci{
  public static void main(String []a){
      printFibonacci(10, 0,1);
	  }
	  
	  static void printFibonacci(int limit,int a,int b){
	    int sum=a+b;
		if(limit>sum){
		  System.out.print(a+"\t");
		  a=b;
		  b=sum;
		  printFibonacci(limit,a,b);
		  }
		  else
		  System.out.print(a+"\t"+b);
		  }
}