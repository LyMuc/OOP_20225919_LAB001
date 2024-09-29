
public class Bai_6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArr[][] = {{9, 2, 7, 4, 1}, {2,3,4,5,6}};
		int iArr2[][]= {{9, 2, 7, 4, 1}, {2,3,4,5,6}};
		int iRows=iArr.length;
		int iCols=iArr[0].length;
		
		for(int i=0; i<iRows; i++)
		{
			for(int j=0; j<iCols; j++) System.out.print(iArr[i][j]+iArr2[i][j] + " ");
			System.out.println();
		}
	}

}
