package kingdom.utilities;

import java.util.ArrayList;
import java.util.List;

public class Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	public List<Observer> getObservers() {
		return observers;
	}
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void setState(String inputStr){
		this.state = inputStr;
		notifyAllKingdom();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	private void notifyAllKingdom(){
		for(Observer observer : observers){
			
			observer.update();
		}
	}

	public void setAllies(String allies) {}
	public void setRuler(String ruler) {}
	public void getRuler() {}
	public void getAllies() {}
	
}
