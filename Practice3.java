package allPractice;

public class Practice3 {
public static void main(String[] args) {
	int num=5;
	int factors=0;
	for (int i=1;i<=num;i++)
	{
		if (num%i==0)
		{
			System.out.println(i);
			factors++;
		}
	}
	if (factors==2)
	{
		System.out.println("its prime number");
	}

	else
	{
		System.out.println("Not a prime number");
	}
}
}
