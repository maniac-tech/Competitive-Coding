import java.util.*;
import java.math.*;
public class bigInteger{
	public static void main(){
		Scanner obj = new Scanner(System.in);
		BigInteger a = obj.nextBigInteger();
		BigInteger b = obj.nextBigInteger();
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}