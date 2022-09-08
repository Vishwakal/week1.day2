package DAy2;

public class ChangeOddIndexTouppercase {

	public static void main(String[] args) {
		
		String test ="changeme";
		char[] ch = test.toCharArray();
		for(int i=0 ;i<=ch.length-1;i++) {
			if (i%2 ==0)
			{
				char s1= ch[i];
				System.out.print(s1);
			}
			else
			{
				char s1=ch[i];
				String s2 = String.valueOf(ch[i]);
				s2=s2.toUpperCase();
				System.out.print(s2);
				
				
				
				
				}
		}
		

	}

}
