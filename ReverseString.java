package DAy2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="HELLOWORLD";
		char[] c1=name.toCharArray();
		int length = c1.length;
		for(int i = length-1; i>=0;i--)
			System.out.println(c1[i]);

			
	}

}
