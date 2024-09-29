import javax.swing.JOptionPane;
import java.lang.Math;;

public class Bai_2_2_6 {
    public static void main(String[] args) {
        String type_solve;
        type_solve=JOptionPane.showInputDialog(null, "Hay chon bai toan ban muon giai: \n 1.Linear Equation\n 2.Linear System \n 3.Quadratic equation");
        double type=Double.parseDouble(type_solve);

        if (type==1) {
            String strNum1, strNum2;
            double num1, num2;
            strNum1=JOptionPane.showInputDialog(null, "Hay nhap he so a: ", JOptionPane.INFORMATION_MESSAGE);
            strNum2=JOptionPane.showInputDialog(null, "Hay nhap he so b: ",JOptionPane.INFORMATION_MESSAGE);

            num1=Double.parseDouble(strNum1);
            num2=Double.parseDouble(strNum2);

            if (num1==0)
            {
                if (num2==0) JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
                else JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
            }
            else{
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem duy nhat la: " + (-num2/num1));
            }
        }

        else if(type==2)
        {
            String strNum1_1, strNum1_2, strNum2_1, strNum2_2, result1, result2;
            double a1, b1, a2, b2, c1, c2;
            strNum1_1=JOptionPane.showInputDialog(null, "Hay nhap he so a1: ", JOptionPane.INFORMATION_MESSAGE);
            strNum1_2=JOptionPane.showInputDialog(null, "Hay nhap he so b1: ",JOptionPane.INFORMATION_MESSAGE);
            result1=JOptionPane.showInputDialog(null, "Hay nhap he so c1: ", JOptionPane.INFORMATION_MESSAGE);
            strNum2_1=JOptionPane.showInputDialog(null, "Hay nhap he so a2: ", JOptionPane.INFORMATION_MESSAGE);
            strNum2_2=JOptionPane.showInputDialog(null, "Hay nhap he so b2: ",JOptionPane.INFORMATION_MESSAGE);
            result2=JOptionPane.showInputDialog(null, "Hay nhap he so c2: ",JOptionPane.INFORMATION_MESSAGE);
            a1=Double.parseDouble(strNum1_1);
            b1=Double.parseDouble(strNum1_2);
            c1=Double.parseDouble(result1);
            a2=Double.parseDouble(strNum2_1);
            b2=Double.parseDouble(strNum2_2);
            c2=Double.parseDouble(result2);

            double delta=a1*b2-b1*a2;
            double deltax=c1*b2-c2*b1;
            double deltay=a1*c2-a2*c1;

            if(delta!=0)
            {
                JOptionPane.showMessageDialog(null, "He phuong trinh co nghiem duy nhat la \n x1=" + (deltax/delta) + "\n x2="+ (deltay)/delta);
            }
            else
            {
                double delta2=a1*c2-a2*c1;
                double delta3=b1*c2-b2*c1;
                if (delta==0 && delta2==0 && delta3==0) JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem");
                else JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem");
            }
        }
        else
        {
            String strNum1, strNum2, strNum3;
            double a,b,c;
            strNum1=JOptionPane.showInputDialog(null, "Hay nhap he so a: ", JOptionPane.INFORMATION_MESSAGE);
            strNum2=JOptionPane.showInputDialog(null, "Hay nhap he so b: ",JOptionPane.INFORMATION_MESSAGE);
            strNum3=JOptionPane.showInputDialog(null, "Hay nhap he so c: ", JOptionPane.INFORMATION_MESSAGE);

            a=Double.parseDouble(strNum1);
            b=Double.parseDouble(strNum2);
            c=Double.parseDouble(strNum3);
            if(a==0)
            {
                JOptionPane.showMessageDialog(null, "Day la he phuong trinh tuyen tinh bac nhat, hay chon option 1"); 
            }
            else
            {
                double delta=b*b-4*a*c;
                if (delta>0) 
                JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem phan biet la \n x1=" +( (-b+Math.sqrt(delta)) /(2*a) ) + "\n x2="+ ( (-b-Math.sqrt(delta)) /(2*a) ));
                else if (delta==0)
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem duy nhat la \n x1=x2= " + ( (-b) /(2*a) ) );
                else JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
            }
        }
    }
}
