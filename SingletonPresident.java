package interviews;

public class SingletonPresident {
	private String name;
	private static final SingletonPresident thePresident = new SingletonPresident("APJ Abdul Kalam");
	
	SingletonPresident(String name){this.name = name; }
	
	
	public static String getPresident(){
		return thePresident.name;
	}
	
	public static void main(String[] args){
		System.out.println(getPresident());
	}
}
