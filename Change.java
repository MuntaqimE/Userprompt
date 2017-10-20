import javax.swing.JOptionPane;
public class Change{
	public static void main(String[] args){
		final int QUARTER =25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;

		String Input = JOptionpane.showInputDialog("Enter amount in 1,5,10 dollar bills");
		int amount = Integer.parseInt(inuput)*100;
		JOptionPane.showInputDialog(null,"The change in Quarters is " + amount/QUARTER);
	        int amount = Integer.parseInt(input)*100;
		JOptionPane.showInputDialog(null,"The change back in Dimes is " + amount/DIME);
		int = Integer.parseInt(input)*100;
		JOptionPane.showInputDialog(null,"The change back in Nickels is " + amount/NICKEL);
		int amount = Integer.parseInt(input)*100;
		JOptionPane.showInputDialog(null,"The change back in Pennies is " + amount/PENNY);
	}
}

