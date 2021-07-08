class StarPattern
{
	public static void main(String a[])
	{
		StarPattern star=new StarPattern();
		System.out.println("Star pattern object is created");
		star.StarPattern();
		
	}
	
	public void StarPattern()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{

				System.out.print("*");
			}
			
		
	
	System.out.println();
}
	}
}