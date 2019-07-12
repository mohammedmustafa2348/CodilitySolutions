import java.util.Scanner;
public class CyclicRotation {

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int K = inScanner.nextInt();
        int N = inScanner.nextInt();
        int []A = new int[N];
        for(int i=0; i < N; i++) {
            A[i] = inScanner.nextInt();
        }
        for (int i :solution(A, K)){
            System.out.print(i + " ");
        }
        inScanner.close();
    }

    
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length > 0) {
            for(int i= 0; i < K; i++){
                int temp = A[A.length-1];
                for(int j=A.length-2; j>=0; j--){
                    A[j+1] = A[j];
                }
                A[0]=temp;
            }
        }
        return A;
    }
}
