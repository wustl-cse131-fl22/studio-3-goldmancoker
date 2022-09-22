package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is the maximum number you want to check for primes? ");	
		int n = in.nextInt();

		boolean[] prime = new boolean[n+1]; //+1 to include n

		for(int i = 0; i <= n; i++)
		{
			prime[i] = true;
		}

		for(int j = 2; j <= n; j++)
		{
			if(prime[j]) //same thing as if true
			{
				for(int p = 2*j; p <= n; p+=j)
				{
					prime[p] = false;
				}
			}
		}

		for(int i = 2; i <= n; i++)
		{
			if(prime[i])
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

}
