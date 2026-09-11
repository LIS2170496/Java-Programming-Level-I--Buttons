/*
   Name:  Lisette Allen
   Class: CIS163AA, Lesson 12 Lab #1
   Date:  4/1/2026
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ButtonsPanel extends JPanel
{
   
   private JButton increment;
   private JButton decrement;
   private JButton randomize;
   private JLabel label;
   private JPanel incrementPanel;
   private JPanel decrementPanel;
   private JPanel randomizePanel;
   private int numValue;
   private Color backgroundColor;
   

   public ButtonsPanel()	// Constructor: Sets up the GUI.
   {
	  setLayout(new FlowLayout());	//Layout manager of choice: Flow


      numValue = 50;

      label = new JLabel("Count: " + String.valueOf(numValue));
      


      increment = new JButton("Increment");
      increment.addActionListener(new ButtonListener());
      //  "this" not allowed? followed suit with old button listener.   
      //  increment.addActionListener(this);  

      decrement = new JButton("Decrement");
      decrement.addActionListener(new ButtonListener());

      randomize = new JButton("Randomize");
      randomize.addActionListener(new ButtonListener());


      

     backgroundColor = new Color(191, 217, 191);

	  setPreferredSize(new Dimension(300, 40));
      setBackground(backgroundColor);
      add(label);
	  


      incrementPanel = new JPanel();
	  incrementPanel.setPreferredSize(new Dimension(300, 40));
	  incrementPanel.setBackground(backgroundColor);
	  incrementPanel.add(increment);

	  setPreferredSize(new Dimension(300, 40));
      setBackground(backgroundColor);
	  add(incrementPanel);



      decrementPanel = new JPanel();
	  decrementPanel.setPreferredSize(new Dimension(300, 40));
	  decrementPanel.setBackground(backgroundColor);
	  decrementPanel.add(decrement);

	  setPreferredSize(new Dimension(300, 40));
      setBackground(backgroundColor);
	  add(decrementPanel);



      randomizePanel = new JPanel();
	  randomizePanel.setPreferredSize(new Dimension(300, 40));
	  randomizePanel.setBackground(backgroundColor);
	  randomizePanel.add(randomize);

	  setPreferredSize(new Dimension(300, 40));
      setBackground(backgroundColor);
	  add(randomizePanel);





   }

   private class ButtonListener implements ActionListener	//Represents listener for button push (action) events.
   {

      public void actionPerformed(ActionEvent event)	// Updates the counter and label when the button is pushed.
      {
		 if (event.getSource() == increment)
		 {
            numValue += 1;
            label.setText("Count: " + String.valueOf(numValue));
		 }

       else if (event.getSource() == decrement)
		 {
            numValue -= 1;
            label.setText("Count: " + String.valueOf(numValue));
		 }

       else if (event.getSource() == randomize)
		 {
            Random randomNum = new Random(); 

            numValue = (randomNum.nextInt(100)) + 1;
            label.setText("Count: " + String.valueOf(numValue));
		 }

	 }
 }
}
