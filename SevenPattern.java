public class SevenPattern  
{  
public static void main(String args[])  
{ 
int rows=5;
for(int r=1;r<=rows;r++){
for(int c=r;c<=rows;c++){
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++){
				System.out.print("*");
			}

		System.out.println();
		}
	System.out.println();
}
}
		
	