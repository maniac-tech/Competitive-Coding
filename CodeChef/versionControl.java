/*Problem Code: VCS*/
import java.io.*;
/*public*/ class versionControl
{
    public static void main (String [] args)throws IOException
    {
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int t;
        int n,m,k;

        /*System.out.println("Enter testcases:");*/
        t=Integer.parseInt(obj.readLine());

        int sum [][] = new int [t][2];
        for (int i=0;i<t;i++)
        {
            /*System.out.println("Enter Value of N:");
            System.out.println("Enter Value of M:");
            System.out.println("Enter Value of K:");*/

            String input [] = obj.readLine().split(" ");
            n=Integer.parseInt(input[0]);
            m=Integer.parseInt(input[1]);
            k=Integer.parseInt(input[2]);

            int arr_n[]=new int[n];
            int arr_m[]=new int[m];
            int arr_k[]=new int[k];
            int z=1;
            for (int j=0;j<n;j++)
            {
                arr_n[j]=z;
                z++;
            }
            /*System.out.println("Enter sequence for M:");*/
            String input_m[]=obj.readLine().split(" ");
            for (int j=0;j<m;j++)
                arr_m[j]=Integer.parseInt(input_m[j]);

            /*System.out.println("Enter sequence for K:");*/
            String input_k[]=obj.readLine().split(" ");
            for (int j=0;j<k;j++)
                arr_k[j]=Integer.parseInt(input_k[j]);

            sum[i][0]=calculate_tracked(arr_n,arr_m,arr_k,n,m,k);
            sum[i][1]=calculate_untracked(arr_n,arr_m,arr_k,n,m,k);
        }

        for (int i=0;i<t;i++)
        {
            System.out.println(sum[i][0]+" "+sum[i][1]);
        }
    }


    public static int calculate_tracked(int arr_n[], int arr_m[], int arr_k[], int n, int m,int k)
    {
        int tracked_ignored=0;

        for (int i=0;i<m;i++)
        {
            for (int j=0;j<k;j++)
            {
                if (arr_m[i]==arr_k[j])
                {
                    tracked_ignored++;
                    break;
                }
            }
        }

        return tracked_ignored;
    }

    public static int calculate_untracked(int arr_n[], int arr_m[], int arr_k[], int n, int m,int k)
    {
        int untracked_unignored=0;
        int count_n=0;
        int count_m=0;
        int count_k=0;
        int count=0;
        for (int i=0;i<n;i++)
        {
            count_n++;
            count_m=0;
            count_k=0;
            
            for (int j=0;j<m;j++)
            {
                if (arr_n[i]!=arr_m[j])
                {
                   
                    count_m++;
                }
                else
                    break;
            }
            for (int j=0;j<k;j++)
            {
                if (arr_n[i]!=arr_k[j])
                {
                    
                    count_k++;
                }
                else
                    break;
            }
            if ((count_m==m)&&(count_k==k))
                count++;
        }
        return count;
    }
}