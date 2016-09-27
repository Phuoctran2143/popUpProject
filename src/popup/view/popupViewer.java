package popup.view;

import javax.swing.JOptionPane;

public class popupViewer
{
	
	/**
	 * Makes a popup window to display the supplied message.
	 * @param message The message to be placed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a input popup to collect a response from the user as a String
	 * @param question The Quest being asked to the user.
	 * @return The users response.
	 */

	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
}
