import java.io.*;
public class utopianTree{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());
		for (int i=0;i<t;i++){
			int input = Integer.parseInt(obj.readLine());
			calculate(input);
		}
	}

	public static void calculate(int input){
		int growth=0;
		for (int i=0;i<=input;i++){
			if (i==0)
				growth++;
			else {
				if (i%2==0)
					growth++;
				else
					growth+=growth;
			}
		}
		System.out.println(growth);
	}
}