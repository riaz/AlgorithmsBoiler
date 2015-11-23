package interviews;

public class ReverseString {
	
	public String reverse(char[] s){
		int x = s.length-1;
		
		for(int i=0;i<(s.length)/2;i++){
			char temp = s[i];
			
					
		    s[i] = s[x];
			s[x]= temp;
			x--;
			
		}		
		return new String(s);
	}
	public static void main(String[] args){
		ReverseString obj = new ReverseString();
		System.out.println(obj.reverse("Hello".toCharArray()));
		System.out.println(obj.reverse("Wonderlust".toCharArray()));
		System.out.println(obj.reverse("The Art of Computer Programming".toCharArray()));
		System.out.println(obj.reverse("Cracking the Coding Interview".toCharArray()));
		
	}
}
