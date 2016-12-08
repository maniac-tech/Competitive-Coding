/*Problem Code: CLEANUP*/
import java.io.*;
/*public*/ class cleaningUp
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		int t=0;
		t=Integer.parseInt(obj.readLine());
		int input_n[]=new int[t];
		int input_m[]=new int[t];
		int diff[]=new int[t];
		int n,m=0;
		

		//Creating respective array to store the job sequence for Chef and Asst:
		int arr_chef[][]=new int [t][1000];
		int arr_asst[][]=new int [t][1000];
		for (int z=0;z<t;z++)
		{
			/*System.out.println("Ente value of n and m:");*/
			String input[]=obj.readLine().split(" ");
			n=Integer.parseInt(input[0]);
			m=Integer.parseInt(input[1]);
			
        	//Storing calues of N and M in array:
			input_n[z]=n;
			input_m[z]=m;

        	//Storing the difference, which will be used to calculate the unused job list:
			diff[z]=input_n[z]-input_m[z];

        	//Creating array for N and M respectively, to store the series:
			int arr_n[]=new int[n];
			int arr_m[]=new int[m];

			/*System.out.println("Ente series for m:");*/
			String series[]=obj.readLine().split(" ");
			for (int i=0;i<m;i++)
	            arr_m[i]=Integer.parseInt(series[i]); //Storing the sequence of m in here

	        //Generating sequence for array N: 
	        int gen=1;
	        //creating array of n:
	        for (int i=0;i<n;i++,gen++)
	        	arr_n[i]=gen;

	        //Eliminating the series of Array M from Array N:
	        for (int i=0;i<m;i++)
	        {
	        	for (int j=0;j<n;j++)
	        	{
	        		if (arr_m[i]==arr_n[j])
	        			arr_n[j]=-1;
	        	}
	        }

	        //eliminating -1 from array n:
	        for (int i=0;i<n;i++)
	        {
	        	for (int j=i+1;j<n;j++)
	        	{
	        		if (arr_n[i]==-1 && arr_n[j]!=-1)
	        		{
	        			int temp = arr_n[j];
	        			arr_n[j]=arr_n[i];
	        			arr_n[i]=temp;
	        		}
	        	}
	        }
	        /*System.out.println();*/
	        
	        //breaking array n into chef and asst:
	        int c=0;
	        int a=0;
	        for (int i=0;i<diff[z];i++)
	        {
	        	/*System.out.println((diff+1)/2);*/
	        	if (i%2==0)
	        	{
	        		arr_chef[z][c]=arr_n[i];
	        		c++;
	        	}
	        	else
	        	{
	        		arr_asst[z][a]=arr_n[i];
	        		a++;
	        	}
	        }
	        /*System.out.println();*/
	    }    

	    for (int z=0;z<t;z++)
	    {
	    	/*System.out.print("Chef:");*/
	    	for (int i=0;i<((diff[z]+1)/2);i++) 
	    	{
	    		if (arr_chef[z][i]==0)
	    			System.out.print(" "+" ");
	    		else
	    			System.out.print(arr_chef[z][i]+" ");
	    	}
	    	System.out.println();

	    	/*System.out.print("Asst:");*/
	    	for (int i=0;i<((diff[z]+1)/2);i++) 
	    	{
	    		if (arr_asst[z][i]==0)
	    			System.out.print(" ");
	    		else
	    			System.out.print(arr_asst[z][i]+" ");
	    	}
	    	System.out.println();
	    }    	    
	}
}