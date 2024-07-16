package prob1;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
public class prob2 {

	public prob2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static String[][] v = new String[105][105];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		for(int i=0;i<n;i++)
		{
			Serializable c = new String[25];
			c = new Scanner(System.in).nextLine();
			v[i]=(String[]) c;
		}
		for(int i=0;i<n-1;i++)
	    {
	        if(v[i][0]==v[n-1][0] && v[i][1]==v[n-1][1] && v[i][2]==v[n-1][2])
	            System.out.print(v[i] + " ");
	    }
	}
		
}
