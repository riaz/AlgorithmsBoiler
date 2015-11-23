package intro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SimpleFileReader {
	public static void main(String[] args){
		System.out.println(args.length);
		if(args.length > 0){
			try{
				BufferedReader br;
				for(int i=0;i<args.length;i++){
					File file = new File(args[i]);
					System.out.println("Reading File :" + file.getName());
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//					br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					br = new BufferedReader(new FileReader(file));
					
					List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()
							), StandardCharsets.UTF_8);				
										
					/*This is a quicker way of fetching and printing the contents*/
					System.out.println("===========================================");
					for(String s: lines){
						System.out.println("|   " + s );
					}
					System.out.println("===========================================");
					
					while(br.ready()){
						System.out.println(br.readLine());
					}
					System.out.println("\n\n");
				}
				
			}catch(FileNotFoundException e){
				System.out.println("A FileNotFoundException has occured");				
				e.printStackTrace();
			}
			catch(IOException e){
				System.out.println("An IOException has occured");
				e.printStackTrace();
			}
		}else{
			System.out.println("No source file was found.");
		}
		
	}
}
