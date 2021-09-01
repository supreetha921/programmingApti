class Palindrome{
	public static void main(String[]a){
		boolean result=checkPalindrome(545);
		if(result==true){
			System.out.println("Number is Palindrome");
		}else
			System.out.println("Number is not Palindrome");
	}
	static boolean checkPalindrome(int num){
	int r;
	int sum=0;
	int n=num;
	
	while(num>0){
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
	}
	if(n==sum){
	return true;
	}
	else
	return false;
	
	}
	}
	

		