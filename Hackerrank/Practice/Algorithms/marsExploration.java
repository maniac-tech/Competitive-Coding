import java.io.*;
public class marsExploration{
	public static void main(String aargs [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String str = obj.readLine();
        int fault=0;
        int correct=0;
        char ref [] = {'S','O','S'};
		if (str.length() >=1 && str.length()<=99 && str.length()%3==0){
			char strChar [] = str.toCharArray();
			int j=0;
			for (int i=0;i<str.length();i++){
				if (strChar[i]==ref[j])
					correct++;
				else
					fault++;
				j++;
				if (j>2)
					j=0;
			}
		}
		System.out.println(fault);
	}
}