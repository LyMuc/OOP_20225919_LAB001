import java.util.Arrays;

public class Bai_6_5 {

    public static void main(String[] args) {
    
        int iArr[] = {9, 2, 7, 4, 1};
        
        int iN = iArr.length;
        
        for(int i = 0; i < iN - 1; i++) {
            for(int j = i + 1; j < iN; j++) {
                if(iArr[i] > iArr[j]) {
                    int tmp = iArr[i];
                    iArr[i] = iArr[j];
                    iArr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(iArr));
    }
}
