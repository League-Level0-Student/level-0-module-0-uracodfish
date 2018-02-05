import javax.swing.JOptionPane;

public class iknowwhatyoudid {
	public static void main(String[] args) {
		String bub = JOptionPane.showInputDialog(null, "what is your name?");
		String bub2 = JOptionPane.showInputDialog(null, "what did you do last summer?");
		String bub3 = JOptionPane.showInputDialog(null, "where?");
		JOptionPane.showMessageDialog(null, "hi " + bub + " you did " + bub2 + " at " + bub3);
	}

}
