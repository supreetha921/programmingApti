public class TenPattern  
{  
public static void main(String args[])  
{ 
int rows=5;
for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r==c || r==2 && c==4 ||r==1 && c==5 ||  r==4 && c==2 || r==5 && c==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
		
	