package allPractice;

public class ReverseString {
	public static void main(String[] args) {
		
	
String st="obul";
String rev="";
int length=st.length();
//System.out.println(length);
//char chat=st.charAt(1);
//System.out.println(chat);

	
	for (int i=length-1;i>=0;i--)
	{
		rev=rev+st.charAt(i);
		
	}
		System.out.println(rev);
	}
}