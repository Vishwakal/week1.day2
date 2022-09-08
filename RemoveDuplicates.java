package DAy2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="we learn java basics as part of java sessions in java week1";
		int count=0;
		String[] str =text.split(" ");
		for (int i=0;i< str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
				count++;
				}
			}
		
		if(count>1)
		{
			text = text.replace(str[i], "");
		}
        count=0;
		}
		//String str2 = String.valueOf(str[i]);
			System.out.println(text);
	}
}

	
		
		

