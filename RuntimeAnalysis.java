package intro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class RuntimeAnalysis {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			double x,y,val;
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			double bb = Math.log(Integer.parseInt(tkn.nextToken()))/Math.log(2);
			double ba = Double.parseDouble(tkn.nextToken());
				
			
			while(br.ready()){
				tkn = new StringTokenizer(br.readLine());
				
				x = Math.log(Integer.parseInt(tkn.nextToken()))/Math.log(2);
				y = Double.parseDouble(tkn.nextToken());
				
//				System.out.println(y);
//				if(ba==0){
//					bb = x; ba = y; continue;
//				}
			
				
				val = (Math.log(y/ba)/Math.log(2))/(x-bb);
				
				System.out.println(val);
				
				bb = x;
				ba = y;
			}
	}
}
