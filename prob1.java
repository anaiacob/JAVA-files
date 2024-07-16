package prob1;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
import java.io.File;
public class prob1 {
	
	public static int[] v = new int[15];
	public prob1(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}
	public static void suma(int n, int s)
	{
		s=0;
		if(n==0)
			s=0;
		else
		{
			while(n!=0)
			{
				v[n%10]++;
				n/=10;
			}
			for(int i=1;i<=9;i=i+2)
			{
				if(v[i]!=0)
					s+=i;
			}
		}
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int cnt = 0;
		Scanner stdin = new Scanner(System.in);
		a = stdin.nextInt();
		suma(a,cnt);
		
	}
	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
