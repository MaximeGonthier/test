package exo1kholle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		ArrayList<candidat> l = new ArrayList<candidat> ();
		l.add(new candidat("AA", "AB", "52",5));
		l.add(new candidat("BB", "BC", "33", 13));
		l.add(new candidat("CC", "CE", "24", 10));
		l.add(new candidat("DD", "DF", "45", 18));
		l.add(new candidat("EE", "ER", "99", 17));
		Collections.sort(l);
		
		System.out.println("Tri par numero :");
		
		Iterator<candidat> it = l.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Tri par moyenne :");
		
		Collections.sort(l, new Bymoyenne());
		Iterator<candidat> at = l.iterator(); 
		for(int i = 0; i < 3; i++){
			System.out.println(at.next());
		}
	}

}
