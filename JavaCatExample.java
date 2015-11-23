package intro;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE_NEW;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JavaCatExample {
	public static void main(String[] args){
		
		if(args.length > 1){ //minimum 2 arguments required. : 1 - input 1 - output
			try{
				 String out = args[args.length-1];
				 
				 for(int i=0;i<args.length-1;i++){ //note args[args.length -1 ] is the path to the output file
					 List<String> content = Files.readAllLines(Paths.get(args[i]), StandardCharsets.UTF_8);
					 
					 /*checking the contents within the file */
//					 for(String line: content){
//						 System.out.println(line);
//					 }
					 
//					 System.out.println(Files.exists(Paths.get(out),LinkOption.NOFOLLOW_LINKS));
					 if(Files.exists(Paths.get(out),LinkOption.NOFOLLOW_LINKS))
						Files.write(Paths.get(out), content, StandardCharsets.UTF_8, new StandardOpenOption[]{ APPEND});
					 else
						Files.write(Paths.get(out), content, StandardCharsets.UTF_8, new StandardOpenOption[]{ CREATE_NEW ,WRITE});
					
					 System.out.println("Concated File : " + args[i]);
				 }
				 System.out.println("Concating Done. Check output file: catOut.txt");

				 
			}catch(FileNotFoundException fnfe){
				fnfe.printStackTrace();
			}catch(NoSuchFileException nsfe){
				nsfe.printStackTrace();
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		else{
			System.out.println("No Input files found.\n Format: JavaCatExample <input_file/s> <output_file>");
		}
	}
}
