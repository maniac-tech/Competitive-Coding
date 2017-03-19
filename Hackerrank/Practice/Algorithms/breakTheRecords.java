import java.io.*;
public class breakTheRecords{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(obj.readLine());
		String input [] = obj.readLine().split(" ");

		int score [] = new int [no];
		int highest[]=new int[no];
		int lowest [] = new int [no];
		int count_high=0;
		int count_low=0;
		int max=0;
		int min=0;

		for (int i=0;i<no;i++)
			score[i]=Integer.parseInt(input[i]);

		highest[0]=score[0];
		lowest[0]=score[0];

		for (int i=1;i<no;i++){
			max=highest[i-1];
			min=lowest[i-1];
			if (score[i]>highest[i-1]){
				highest[i]=score[i];
				count_high++;
			}
			else
				highest[i]=max;
			
			if (score[i]<lowest[i-1]){
				lowest[i]=score[i];
				count_low++;
			}
			else
				lowest[i]=min;
		}
		System.out.print(count_high+" ");
		System.out.println(count_low);
	}
}