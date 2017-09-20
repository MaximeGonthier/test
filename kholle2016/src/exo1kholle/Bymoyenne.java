package exo1kholle;

import java.util.Comparator;

public class Bymoyenne implements Comparator<candidat> {

	public int compare(candidat c1, candidat c2){
		return c2.getMoyenne() - c1.getMoyenne();
	}
}
