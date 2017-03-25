import java.io.*;
public class reducedStrings{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input = obj.readLine();
		int len=input.length(); //storing the length of the string

		for (int i=1;i<len;i++){ //running the loop from position:0 to position: len
			if (input.charAt(i)==input.charAt(i-1)){ //matching the characters
				input=input.substring(0,i-1)+input.substring(i+1); //concatenating two substrings without the common character
				i=0;
				len=input.length(); //reseting the length to new string
				//System.out.println(input);
			}
		}
			if (input.length()==0)
				System.out.println("Empty String");
			else
				System.out.println(input);
		}
	}