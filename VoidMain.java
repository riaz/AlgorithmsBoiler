package interviews;

/*
 * Execution Steps:
 * 1. javac VoidMain
 * 2. java -Djava.system.class.loader=VoidMain
 * Note: This seems to be the only method to print HelloWorld in java-7/8 
 * */

public class VoidMain extends ClassLoader{
	public VoidMain(ClassLoader other){
		super(other);
		System.out.println("Hello World");
		System.exit(0);
	}
}

