
public class StringCompression {

	public static void main(String[] args) {
		String str="aabcccccaas";
		int count = 0;
		char cur=str.charAt(0);
		String toReturn=""+cur;
		for(int i=0;i<str.length();i++){
			if(cur!=str.charAt(i))
			{
				toReturn+=count;
				cur=str.charAt(i);
				count=0;
				toReturn+=str.charAt(i);
			}
			count++;
		}
		toReturn+=count;
		if(toReturn.length()<str.length())
			System.out.println(toReturn);
		else
			System.out.println(str);
	}

}
