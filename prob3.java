package prob1;

import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class prob3 {

	public prob3() {
		// TODO Auto-generated constructor stub
	}
	public static int[] v = new int[15];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		FileInputStream f = new FileInputStream("numere.txt");
//		InputStreamReader fchar = new InputStreamReader(f);
//		BufferedReader buf = new BufferedReader(fchar);
		int x;
		int k;
		int l=0;
		int lmax = 0;
		int nr = 0;
		int y = 0;
		int lmax_ant = 0;
		
/*		
		Sugestii: Pentru a citi din fisier se decomenteza partea de inceput din calsa main, aceea cu fileinput; iar pentru a opri din citit numere pe consola se foloseste Ctrl+Z, deoarece stdin.hasNext() are mereu valoare de adevar. 
*/	
		Scanner stdin = new Scanner(System.in);
		k = stdin.nextInt();
		while(stdin.hasNext())
		{
			x = stdin.nextInt();
			y = lmax_ant;
	        if(x%k==0)
	        {

	            l++;
	            if(lmax<l)
	                {
	                    lmax=l;
	                }

	        }
	        else
	        {
	            l=0;
	            if(lmax>lmax_ant)
	                {
	                    nr=0;
	                    lmax_ant=lmax;
	                }
	            else if(lmax==y && lmax!=0) nr++;
	        }

		}
		nr++;
		System.out.print(lmax + " " + nr);
	}

}
