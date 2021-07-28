class StringApti{
	public static void main(String []a){
	StringApti Apti=new StringApti();
	Apti.String1();
	System.out.println("----------------------------------------------");
	Apti.String2();
	System.out.println("----------------------------------------------");
	Apti.String3();
	System.out.println("----------------------------------------------");
	Apti.String4();
	System.out.println("----------------------------------------------");
	/*Apti.String5();
	System.out.println("----------------------------------------------");*/
	Apti.String6();
	System.out.println("----------------------------------------------");
	Apti.String7();
	System.out.println("----------------------------------------------");
	Apti.String8();
	System.out.println("----------------------------------------------");
	Apti.String9();
	System.out.println("----------------------------------------------");
	Apti.String10();
	System.out.println("----------------------------------------------");
	
	
	
	
	
	
	}
	
	
	void String1(){
		
		String s= "hello developers,good afternoon,welcome to x-works,today is holiday";
		char []ch=s.toCharArray();
		int c ='e';
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]== 'e') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		}
		void String2(){
		
		String s= "hello developers, good afternoon, welcome to x-works, today is holiday";
		char []ch=s.toCharArray();
		int c =' ';
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]== ' ') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		}
		void String3(){
		
		String s= "hello developers, good afternoon, welcome to x-works, today is holiday";
		char []ch=s.toCharArray();
		char c1 ='a';
		char c2= '@';
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==c1) {
				ch[i]=c2;
			}
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		
		
		
		}
		void String4(){
		
		String s="hello";
		char []ch=s.toCharArray();
        String newStr=" ";
		for(int i=0;i<ch.length;i++)
		{
			
			if(newStr.indexOf(ch[i])== -1 )
			{
				newStr=newStr+ch[i];
				
				System.out.print(ch[i]);
		
			}
		}
		
		
		
		}		
		/*void String5(){
		
		String s= "hello developers, good afternoon, welcome to x-works, today is holiday";
		char []ch=s.toCharArray();
		String result="";
		s=s.trim();
		
		
		
			for(int i=ch.length-1;i>=0;i--){
				result+= ch[i];
				
				
			
		}
		
			System.out.print(result.trim());
		
		
				}*/
		void String6(){
		
		String s= "hello developers, good afternoon, welcome to x-works, today is holiday";
		char []ch=s.toCharArray();
		
		String str1= s.replaceAll("hello","hi");
		
		
		
			System.out.println(str1);
			
		}
		
		
		
		
		void String7(){
		
		String s="hello  developers,good afternoon, welcome to x-works, today is holiday";
       char []ch=s.toCharArray();		
	     String[] words=s.split(" developers"); 
 
		for(String w:words){  
			System.out.print(w);  
			}  
		}
		
        void String8(){
		
		String s="hello  developers,good afternoon, welcome to x-works, today is holiday";
        char []ch=s.toCharArray();		
        String[] words=s.split("d"); 
 
        for(String w:words){  
         System.out.print(w);  
     }  
		}
		


      void String9(){
		
      String s= "HELLO developers, good afternoon, welcome to x-works, today is holiday";
	  char []ch=s.toCharArray();
		
		
		
      System.out.println(s.toLowerCase());
		
		
		
		
	}

      void String10(){
		
      String s= "hello developers, good afternoon, welcome to x-works, today is holiday";
	  char []ch=s.toCharArray();
	  int intIndex=s.indexOf("good");
	  if(intIndex== -1) {
		  System.out.println("good not found");
	  }else{
		  System.out.println("Found good at index"+intIndex);
	  }
	  }
		
		
		
    

		
		
		
		
		
		
		
		
		
}