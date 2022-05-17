package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Collection_ArrayList {
	
	public ArrayList<Integer> al;
	
	public LinkedHashMap<Integer, Integer> lh;
	
	public  ArrayList<Integer> arrayMethod() {
		
		al=new ArrayList<Integer>();
		
		ArrayList<Integer> k=loop();
		
		
		return k;
		
		
		
	}
	
	public ArrayList<Integer> loop() {
		
		
		for(int i=0;i<=10;i++) {
			
			al.add(i);
		}
		
		return al;
	}

	public static void main(String[] args) {
		
		Collection_ArrayList array=new Collection_ArrayList();
		System.out.println(array.lh);
		
		ArrayList<Integer> kk=array.arrayMethod();
		
		System.out.println(kk);
		
		array.mapMethod(kk);
		
		
		

	}
	
	public  void mapMethod(ArrayList<Integer> kk) {
		
		
	//	Collection_ArrayList=new LinkedHashMap<Integer, Integer>();
		
		
		String index=al.get(2).toString();
		System.out.println(index);
		
		
	}
	
	

}
