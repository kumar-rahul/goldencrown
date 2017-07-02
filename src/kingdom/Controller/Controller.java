package kingdom.Controller;

import java.util.Scanner;

import kingdom.event.Air;
import kingdom.event.Fire;
import kingdom.event.Ice;
import kingdom.event.Land;
import kingdom.event.Southeros;
import kingdom.event.Space;
import kingdom.event.Water;
import kingdom.utilities.Observable;

public class Controller {

	private Observable kingdom;
	public Controller(){
		kingdom = new Southeros();
		this.callService(0);
	}
	public void callService(int event){
		switch(event) {
		   case 0 :
				new Air(kingdom);
				new Fire(kingdom);
				new Ice(kingdom);
				new Land(kingdom);
//				new Space(kingdom);
				new Water(kingdom);
		      break;
		   
		   case 1 :
				kingdom.getRuler();
		      break;
		      
		   case 2 :
			   kingdom.getAllies();
			      break;

		   case 3 :
				Scanner scan = new Scanner(System.in);
				int i = 1;
				while(true){
					System.out.println("Message"+i+": ");
					String inputStr = scan.nextLine();
					if(inputStr.toUpperCase().equals("SEND")){
						break;
					}else{
						kingdom.setState(inputStr);
						i++;
					}
				}
				break;
			      
			   case 4 :
				   kingdom.getAllies();
				   break;
			   
		   default: System.out.println("Invalid event"); 
		}
	}
	
}
