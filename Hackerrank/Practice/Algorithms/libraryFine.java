import java.math.*;
import java.io.*;
public class LibraryFine{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		String input_return[]=obj.readLine().split(" ");
		String input_due[]=obj.readLine().split(" ");

		int RDate = Integer.parseInt(input_return[0]);
		int RMonth =Integer.parseInt(input_return[1]);
		int RYear=Integer.parseInt(input_return[2]);

		int DDate=Integer.parseInt(input_due[0]);
		int DMonth=Integer.parseInt(input_due[1]);
		int DYear=Integer.parseInt(input_due[2]);

		int fine=0;

		if (RYear>DYear)
			fine=10000;
		else{
			if (RYear<=DYear){
				if (RMonth>DMonth && RYear==DYear)
					fine=500*(RMonth-DMonth);
				else {
						if (RDate>DDate && RMonth==DMonth && RYear==DYear)
							fine=15*(RDate-DDate);
						else 
							if (RDate<=DDate)
								if (RMonth<DMonth)
									if (RYear<DYear)
										fine=0;
					}
				}
			}
		System.out.println(fine);
		}
}