package allPractice;

public class ReverseStringUsingBufferClass {
public static void main(String[] args) {
	String st="laddu";
	StringBuffer sb=new StringBuffer(st);
	//sb.append(st);
	sb.reverse();
	System.out.println(sb);
	
	
	String str="siva";
	StringBuffer sbt=new StringBuffer(str);
	sbt.reverse();
	System.out.println(sbt);
}
}
