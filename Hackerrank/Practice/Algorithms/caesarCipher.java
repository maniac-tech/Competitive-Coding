import java.io.*;
public class caesarCipher{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int len=Integer.parseInt(obj.readLine());
		String str=obj.readLine();
		int k=Integer.parseInt(obj.readLine());
		String output="";
		int count=0;
		for (int i=0;i<len;i++){
			if (Character.isWhitespace(str.charAt(i)))
				break;
			else
				count++;
		}

		if(count==len){
			for (int i=0;i<len;i++){
				char temp=str.charAt(i);
				if ((temp>='a' && temp<='z')){

					if (Character.isLowerCase(temp)){					
						temp=(char)(((int)str.charAt(i))+k);
						if (temp>'z'){
							int diff = temp-'z';
							temp=(char)(((int)'a')+(diff-1));
						}
					}
					output=output+temp;
				}
				else if (( temp>='A' && temp<='Z')){
					if (Character.isUpperCase(temp)){
						temp=(char)(((int)str.charAt(i))+k);
						if (temp>'Z'){
							int diff = temp-'Z';
							temp=(char)(((int)'A')+(diff-1));
						}	
					}
					output=output+temp;
				}
				else
					output=output+str.charAt(i);
				
			}
		}
		System.out.println(output);
	}
}