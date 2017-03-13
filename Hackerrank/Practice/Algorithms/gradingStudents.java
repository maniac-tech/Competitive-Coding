import java.io.*;
public class gradingStudents{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());

		for (int i=0;i<t;i++){
			int temp=Integer.parseInt(obj.readLine());
			if (temp>=38){
				if ((temp%5)==3)
					temp+=2;
				else if (temp%5==4)
					temp+=1;
			}
			System.out.println(temp);
		}
	}
}