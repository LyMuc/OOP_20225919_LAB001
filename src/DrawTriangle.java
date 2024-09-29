import java.util.Scanner;
public class DrawTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        
        int iN= sc.nextInt();
        int iCount=1;
        int iStar=1;
        
        while (iN>=1)
        {
        	for (int i=0; i<(iN-1); i++) System.out.print(" ");
        	for (int i=0; i<iStar; i++) System.out.print("*");
        	System.out.println();
        	if (iCount==1) iStar+=2;
        	else iStar=3*iCount-1;
        	iCount=iCount+1;
        	iN=iN-1;
        }
        
        sc.close();
	}

}
