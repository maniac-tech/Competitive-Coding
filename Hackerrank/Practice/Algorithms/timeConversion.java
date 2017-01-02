import java.io.*;
import java.util.*;
public class timeConversion{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		/*System.out.println("Enter you time");*/
		String input [] = obj.readLine().split(":");
		Formatter fmt = new Formatter();

		int hh = Integer.parseInt(input[0]);
		int mm = Integer.parseInt(input[1]);
		String time = input[2];
		int ss=Integer.parseInt(time.substring(0,2));
		time = time.substring(2,4);
		
		if (hh>=1 && hh<=12 && mm>=00 && mm<=59 && ss>=00 && ss<=59){
			if ((time.toLowerCase()).equals("am")){
				if (hh==12)
					hh=00;
				fmt.format("%02d:%02d:%02d",hh,mm,ss);
				System.out.println(fmt);
			}
			else{
				if (hh==12)
					hh=12;
				else
					hh+=12;
				fmt.format("%02d:%02d:%02d",hh,mm,ss);
				System.out.println(fmt);
			}
		}
	}
}