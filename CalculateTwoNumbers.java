import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
	public static void main(String[] args){
		String strNum1, strNum2;
		double num1, num2;
		strNum1=JOptionPane.showInputDialog(null, "Please input the first number: ",
		"Input the first number", JOptionPane.INFORMATION_MESSAGE);

		strNum2=JOptionPane.showInputDialog(null, "Please input the second number: ",
		"Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		num1=Double.parseDouble(strNum1);
		num2=Double.parseDouble(strNum2);

		JOptionPane.showMessageDialog(null, "Tong cua 2 so la: " + (num1+num2) );
		JOptionPane.showMessageDialog(null, "Hieu cua 2 so la: " + (num1-num2) );
		JOptionPane.showMessageDialog(null, "Tich cua 2 so la: " + (num1*num2) );

		if (num2==0) JOptionPane.showMessageDialog(null, "So chia bang 0! ");
		else JOptionPane.showMessageDialog(null, "Thuong cua 2 so la: " + (num1/num2) );

		System.exit(0);

	}
}