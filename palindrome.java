package DAy2;

public class palindrome {

	public static void main(String[] args) {
		String str ="madam";
		String rev="";
		char[] ch =str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+String.valueOf(ch[i]);
		}
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}
			else {
				
				System.out.println("Its not a palindrome");
		}

	}

}
