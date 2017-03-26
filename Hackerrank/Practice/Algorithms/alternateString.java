import java.io.*;
public class alternateString{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader ( new InputStreamReader (System.in));
		int t =Integer.parseInt(obj.readLine());

		if (t>=1 && t <= 10){//checking constraints
			for (int i=0;i<t;i++){
				String input = obj.readLine();
				int len = input.length();
				int count=0;
				if (len >=1 && len <=100000){
					for (int j=1;j<input.length();j++){
						if (input.charAt(j)==input.charAt(j-1)){
							count++;
						}
					}
					System.out.println(count);
				}
			}
		}
	}
}