package string_manip;

import javax.swing.JOptionPane;

public class CandyCrush {

    public static void main(String[] args) {
        // 1. Using a pop-up, ask the user who they don't like
String ans=JOptionPane.showInputDialog("who do you dislike?");
        // 2. Change the next line so that the pop-up will tell them they have a crush on that person
        JOptionPane.showMessageDialog(null, "You totally have a crush on "+ans+"!");
		
        // 3. Ask the user for the name of their best friend
String ams=JOptionPane.showInputDialog("who's your best friend?");
        // 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, ams+" is as sweet as candy!");
    } 
}