package allPractice;

import allPractice2.Palindrome;

public class Practice5 {
public static void main(String[] args) {
	int num=2112;
	int palind=num;
	int rev=0;
	while (num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if (palind==rev)
	{
		System.out.println(rev);
	}
	{
		
	}
}

}
