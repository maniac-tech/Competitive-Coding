import java.io.*;
public class funnyString{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());		
		if (t>=1 && t<=10){
			for (int j=0;j<t;j++){
				int control=0;
				String input = obj.readLine();
				StringBuffer str = new StringBuffer(input);
				String rev = str.reverse().toString();
				int len=input.length();
				if (len>=2 && len<=10000){
					for (int i=1;i<len;i++){
						int diff_input=(input.charAt(i)-input.charAt(i-1));
						int diff_rev=(rev.charAt(i)-rev.charAt(i-1));
						diff_input=Math.abs(diff_input);
						diff_rev=Math.abs(diff_rev);
						if (diff_rev==diff_input)
							control=1;
						else{
							control=0;
							break;
						}
					}
					if (control==0)
						System.out.println("Not Funny");
					else
						System.out.println("Funny");
				}
				
			}
		}
	}
}