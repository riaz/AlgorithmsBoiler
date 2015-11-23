package intro;

public class Date implements Comparable<Date>{
	
	private final int day,month,year;
	
	public Date(){
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public static void main(String[] args){
		Date date1 = new Date(19,9,1990);
		Date date2 = new Date(27,11,2015);
		
		System.out.println(date1.compareTo(date2));
				
	}

	@Override
	public int compareTo(Date next) {
		if(this.year > next.year) return -1;
		else if(this.month > next.month) return -1;
		else if(this.day > next.day) return -1;
		else if(this.year < next.year) return 1;
		else if(this.month < next.month) return 1;
		else if(this.day < next.day) return 1;
		else return 0;		
	}
}	
