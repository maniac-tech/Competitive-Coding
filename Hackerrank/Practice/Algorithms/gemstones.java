import java.io.*;
public class gemstones{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());
		String str [] = new String [t];
		int gem=0;

		for (int  i=0;i<t ;i++ ) 
			str [i] = obj.readLine();

		char charArray [] = str[0].toCharArray();
		int len=str[0].length();

		for (int j=0;j<len;j++){
            int control=0;
			for (int i=0;i<t;i++){
				if (str[i].indexOf(charArray[j])!=-1)
					control++;
				else
					break;
			}
			if (control==t)
				gem++;
		}

		System.out.println(gem);
	}
}