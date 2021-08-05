
import java.util.Scanner;
class Factorial{
  public static void main(String []a){
  Scanner se=new Scanner(System.in);
	int num=se.nextInt();
	Factorial fa=new Factorial();
	fa.printFactorial(num);
	System.out.println("----------------------------------------------");
      
	  }
	  
	  static void printFactorial(int num){
		  int i,fact=1;
	    for(i=1;i<num;i++){
			fact=fact*num;
		}
		System.out.println(fact);
}
}