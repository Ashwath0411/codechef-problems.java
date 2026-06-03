import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    double gross = sc.nextInt();
		    
		    if(gross<1500){
		        gross = gross +(0.10*gross)+(0.90*gross);
		       
		       
		        
		    } else if(gross>1500){
		        gross = gross +(500)+(0.98*gross);
		        
		    }System.out.println(gross);
		}

	}
}
