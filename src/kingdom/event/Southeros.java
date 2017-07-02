package kingdom.event;

import java.util.ArrayList;
import java.util.List;
import kingdom.utilities.Observable;

public class Southeros extends Observable{
	private List<String> allies = new ArrayList<String>();
	private String ruler = "None";

	public void getAllies() {
			if(ruler.equalsIgnoreCase("None")){
				System.out.println("Allies:: None");
				this.allies.removeAll(allies);
			}else{
				String r_allies = String.join(", ", allies);					
				System.out.println(r_allies);
			}
	}

	public void setAllies(String allies) {
		this.allies.add(allies);
	}
	
	public void getRuler() {
		System.out.println(this.ruler);
	}

	public void setRuler(String ruler) {
		int len = (getObservers().size()/2) + 1;
		if(allies.size()>=len){
			this.ruler = ruler;
		}
	}	
}
