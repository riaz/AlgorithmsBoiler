import java.util.*;
import java.math.*;
import java.io.*;
 
/**Program: Sieve of Erathosthenes
 * Author : Munshi Riaz  
*/
 
class PrimeFind
{ 
    public static void main(String[] args) throws IOException
    {
        int n;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
       boolean arr[] = new boolean[n];
       Arrays.fill(arr,true);  
       
        
       for(int i=2;i<Math.sqrt(n);i++)       
            for(int j=2*i;j<n;j+=i)                        
                arr[j] = false;    
        
       for(int i=2;i<n;i++)    
       if(arr[i]==true)
        System.out.println(i);
    } 
}