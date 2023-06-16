package allPractice;


public class StringReverse {
public static void main(String[] args) {
	String st="Obulesh";
	char ch;
	String rev="";
	
	
	StringBuilder sb=new StringBuilder();
	sb.append(st);
	sb.reverse();
	System.out.println(sb);
	
for(int i=0;i<=st.length();i++)
{
     	ch=st.charAt(i);
     	rev=ch+rev;
}
	
	System.out.println(rev);

	}

}

