import java.io.*;
import java.util.*;

public class anagrams {
	    static boolean isAnagram(String a, String b) {
        // Complete the function
        String str1 = a;
		String str2 = b;
        int len=0;

		if (str1.length()==str2.length()){
			len = str1.length();
			char arr [] = new char [len];
			int len1 [] = new int [len]; 
			int len2[] = new int [len];
			char ch1 [] = str1.toLowerCase().toCharArray();
			char ch2 [] = str2.toLowerCase().toCharArray();
			
			ArrayList <Character> finalCh1 = new ArrayList <Character>();
			ArrayList <Integer> finalLen1 = new ArrayList <Integer>();
			// Sorting the First Array of characters to count the no of characters
			// and eliminate copies from the array
			for (int i=0;i<len;i++){
				int tempCount=1;
				for (int j=i+1;j<len;j++){
					if (ch1[i]!='-'){
						if ((ch1[i]==ch1[j])&&(ch1[j]!='-')){
							tempCount++;
							ch1[j]='-';
						}
					}else{
						break;
					}
				}
				len1[i]=tempCount;
			}
			
			// Sorting the Second Array of characters to count the no of characters
			// and eliminate copies from the array
			for (int i=0;i<len;i++){
				int tempCount=1;
				for (int j=i+1;j<len;j++){
					if (ch2[i]!='-'){
						if ((ch2[i]==ch2[j])&&(ch2[j]!='-')){
							tempCount++;
							ch2[j]='-';
						}
					}else{
						break;
					}
				}
				len2[i]=tempCount;
			}
			int controlVariable=0;
			int controlVariableCheck=0;
			for (int i=0;i<len;i++){
				if (ch1[i]!='-'){
					controlVariable++;
				}
			}
			for (int i=0;i<len;i++){
				if (ch1[i]!='-'){
					for (int j=0;j<len;j++){
						if (ch1[i]==ch2[j]){
							if (len1[i]==len2[j]){
			             //Increment some control variable
								controlVariableCheck++;
							}else{
								break;
							}
						}
					}
				}
			}
			if (controlVariable==controlVariableCheck){
				return true;
			}
			else{
				return false;
			}
    }else{
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}