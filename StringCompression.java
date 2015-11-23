package interviews;

public class StringCompression {
	public static void main(String[] args){
		String a = "aaaabbcccdddeefffggiqqqaa";
		char c='!';
		int count=0;
		for(int i=0;i<a.length();i++){
			if(c == a.charAt(i))
				++count;
			else{
				if(count>1)
					System.out.print(c+""+count);
				else if(count==1)
					System.out.print(c);
				
				c = a.charAt(i);
				count = 1;				
			}		
			
		}
		System.out.print(c+""+count);
		System.out.println();		
	}
}
