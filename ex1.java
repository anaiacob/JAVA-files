package ex1;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class prob1 {

	public prob1() {
		// TODO Auto-generated constructor stub
	}
	public static void divizor(int a, int b, int k, int nr)
	{
		nr=0;
		int i = a;
		while(i<=b)
		{
			if(i%10==k)
			{
				if(i%k==0)
					nr++;
				i=i+10;
			}
			else i++;
		}
		System.out.print(nr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		int k;
		int cnt = 0;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		m = stdin.nextInt();
		k = stdin.nextInt();
		divizor(n,m,k,cnt);
	}

}
