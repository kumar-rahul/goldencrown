package kingdom.event;

import kingdom.model.Model;
import kingdom.utilities.Observable;
import kingdom.utilities.Observer;

public class Air implements Observer{
	private Observable observable;
	private String name = "Air";
	private String emblem = "Owl";
	private Model model;

	public Air(Observable kingdom){
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
