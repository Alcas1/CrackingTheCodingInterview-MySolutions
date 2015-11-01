
public class isPalinPerm {

	public static void main(String args[]){
		//O(n) runtime 		
		//O(128) space => O(1)
		String perm="tact ica";
		int[] chars=new int[128];
		for(int i=0;i<perm.length();i++){
			if(perm.charAt(i)!=' ')
				chars[perm.charAt(i)]++;
		}
		boolean flag=false;
		for(int i=0;i<chars.length;i++){
			if(chars[i]%2==1)
			{
				if(flag)
				{	System.out.println("False");
					System.exit(0);
				}
				flag=true;
			}
		}
		System.out.println("True");
		
		
	}
	

}
