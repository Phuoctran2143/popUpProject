package popup.controller;
	 
	import popup.view.popupViewer;
	import popup.model.thingy;
	 
	import java.util.List;
	import java.util.ArrayList;
	 
	public class Controller
	{
		private popupViewer display;
		private List<thingy> thingyList;
	 
		public void popupController()
		{
			display = new popupViewer();
			thingyList = new ArrayList<thingy>();
	 
		}
	 
		public void start()
		{
			learnLists();
	 
		}
	 
		private void testLoop()
		{
			String answer = "sample";
			while (answer != null && !isDouble(answer))
			{
	 
				answer = display.collectResponse("You need to type in a number ");
			}
		}
	 
		/**
		 * Checks if the supplied String can be parsed to a double value.
		 * 
		 * @param potentialValue
		 *            The string to test.
		 * @return Whether the value could be parsed; true if it can be parsed,
		 *         false otherwise.
		 */
		private boolean isDouble(String potentialValue)
		{
			boolean isParseable = false;
	 
			try
			{
				double test = Double.parseDouble(potentialValue);
				isParseable = true;
			}
			catch (NumberFormatException notdouble)
			{
				display.displayMessage("This is not  a double value =:<");
			}
	 
			return isParseable;
		}
	 
		/*
		 * Checks that the supplied string is parseable to an integer value.
		 * 
		 * @param potentialNumber The string to test for parsing.
		 * 
		 * @return Whether it could be parsed as an integer.
		 */
		private boolean isInteger(String potentialNumber)
		{
			boolean isParseable = false;
	 
			try
			{
				int test = Integer.parseInt(potentialNumber);
				isParseable = true;
			}
			catch (NumberFormatException notInt)
			{
				display.displayMessage(notInt.getMessage());
				display.displayMessage("Type in an integer next time!");
			}
	 
			return isParseable;
		}
	 
		private void learnLists()
		{
			display.displayMessage(thingyList.size() + " is the size of the list.");
			thingy testThingy = new thingy();
			thingyList.add(testThingy);
			display.displayMessage(thingyList.size() + " is the size of the list.");
	 
			for (int index = 0; index < 5; index++)
			{
				thingy addThingy = new thingy();
				thingyList.add(addThingy);
				display.displayMessage(addThingy.getWords());
	 
			}
	 
			display.displayMessage(thingyList.size() + " is the size");
	 
			thingyList.get(3).setWords("Look I changed a value");
			thingy temp = thingyList.get(4);
			temp.setWords("stuff");
	 
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage(thingyList.get(index).getWords());
	 
			}
			
			thingyList.add(3, new thingy());
			
			display.displayMessage("The size is: " + thingyList.size());
			
			thingyList.remove(0);
			
			display.displayMessage("The size is: " + thingyList.size());
			
			thingy deletedThingy = thingyList.remove(3);
			display.collectResponse(deletedThingy.getWords() + " and the lsit size is " + thingyList.size());
			
			thingyList.set(0, deletedThingy);
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage(thingyList.get(index).getWords());
			}
			
			for (thingy currentThingy : thingyList)
			{
				display.displayMessage(currentThingy.getWords());
			}
		}
	}


		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	