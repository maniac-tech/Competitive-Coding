import java.io.*;
public class catAndMouse{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t = Integer.parseInt(obj.readLine());
		for (int i=0;i<t;i++){
			String input [] = obj.readLine().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			int c=Integer.parseInt(input[2]);

			if (a<b && b<c)
				System.out.println("Cat B");
			else if (a>b && a<c)
				System.out.println("Cat A");
			else if (a<b && c<b){
				if (a<c){
					if ((c-a)>(c-b))
						System.out.println("Cat B");
					else if ((c-a)<(c-b))
						System.out.println("Cat A");
					else if ((c-a)==(c-b))
						System.out.println("Mouse C");
				}
			}
		}
	}
}