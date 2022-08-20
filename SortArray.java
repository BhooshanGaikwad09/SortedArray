package bg;


	import java.util.Scanner;
	import java.util.Arrays;
	public class SortArray {
		public static void main(String[] args) {
			Scanner s=new Scanner (System.in);
		  System.out.println("enter data in array");
		  int size=s.nextInt();
		  int a[]=new int [5];
		  for(int i=0;i<a.length;i++)
		  {
		  	a[i]=s.nextInt();
		  }
		  Arrays.sort(a);
		    System.out.println("sorted array");
		  
		  	  for(int i=0;i<a.length;i++)
		  	  {
		 System.out.println(a[i]+" ");
		  	  }
		}
	}

