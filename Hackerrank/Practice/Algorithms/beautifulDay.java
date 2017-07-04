import java.io.*;
public class beautifulDay{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int i,j,k;
		String input [] = obj.readLine().split(" ");
		i=Integer.parseInt(input[0]);
		j=Integer.parseInt (input[1]);
		k=Integer.parseInt(input[2]);
		int count=0;

		for (int x=i;x<=j;x++){
			int rev=reverse(x);
			if (rev>=x){
				if ((rev-x)%k==0)
					count++;
			}
			else if (x>rev){
				if ((x-rev)%k==0)
					count++;
			}
		}
		System.out.println(count);
	}

	public static int reverse(int x){
		int rev=0;
		while (x>0){
			int temp=x%10;
			rev+=temp;
			rev*=10;
			x/=10;
		}
		rev/=10;
		return rev;
	}
}