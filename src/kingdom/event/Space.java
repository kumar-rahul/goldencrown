package kingdom.event;

import kingdom.model.Model;
import kingdom.utilities.Observable;
import kingdom.utilities.Observer;

public class Space implements Observer{
	private Observable observable;
	private String name = "Space";
	private String emblem = "Gorilla";
	private Model model;

	public Space(Observable kingdom){
		this.observable = kingdom;
		this.observable.attach(this);
		model = new Model();
	}
	
	public String getEmblem(){
		return emblem;
	}
	
	@Override
	public void update() {
		String[] temp = this.observable.getState().split(",");
		if(temp[0].equalsIgnoreCase(name) && model.containsAllChars(temp[1],getEmblem())){
			this.observable.setAllies(name);
			this.observable.setRuler("King Shan");
		}
	}
}
