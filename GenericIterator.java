package intro;


import java.util.Iterator;


public class GenericIterator<Item> implements Iterable<Item> {
	private int index = 0;
	Item[] array;
	
	public Iterator<Item> iterator(){
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		public boolean hasNext(){
			return index!=0;
		}
		
		public Item next(){
			return array[index++];
		}
		
		public void remove(){
			index--;
		}
		
	}
	
	public static void main(String[] args){
			GenericIterator<String> s = new GenericIterator<String>();
			s.array = new String[2];
			s.array[0] = "Hello";
			s.array[1] = "World";
			
			for(String txt:s.array){
				System.out.println(txt);
			}
			
			GenericIterator<Integer> p = new GenericIterator<Integer>();
			p.array = new Integer[2];
			p.array[0] = 1;
			p.array[1] = 2;
			
			for(int txt:p.array){
				System.out.println(txt);
			}
			
	}
}
