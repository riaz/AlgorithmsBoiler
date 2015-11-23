package intro;

import edu.princeton.cs.algs4.*;

public class StopWatch1 {
	private static double currentTime; 
	
	public StopWatch1(){
	   currentTime = System.currentTimeMillis();	
	}
	
	public static double getTimeElapsed(){ //returns time in seconds
		double instantTime = System.currentTimeMillis();
		return (instantTime - currentTime)/1000.0;
	}
	
	public static void main(String[] args){
		StdOut.println("The time elapsed since the object creation by the JVM");
		StdOut.println("Seconds : " + getTimeElapsed());
	}
}
