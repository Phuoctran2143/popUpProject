package popup.controller;

import popup.view.popupViewer;

public class Controller
{
	
	private popupViewer display;
	
	public Controller()
	{
		display = new popupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer!= null &&!answer.equals(""))
		{
		display.displayMessage("Hi the :D");
		
		answer = display.collectResponse("what is goin on?");
		display.displayMessage(answer + "is what you said.");
		}
	}
}
