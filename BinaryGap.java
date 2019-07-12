import java.util.Scanner;

public class BinaryGap {

    public static void main(String []args) {
        Scanner inScanner = new Scanner(System.in);
        int N;
        do {
            N = inScanner.nextInt();
            System.out.println("\n" + solution(N));
        }while(N!=-1);
        inScanner.close();
    }
    
    public static int solution(int N) {
        boolean start = false;
        int prevCounter = 0;
        int curCounter = 0;
        while(N > 0){
            int reminder = N % 2;
            System.out.print(reminder);
            if(reminder == 1){
                if(!start){
                    start = true;
                }
                else{
                    if(curCounter > prevCounter){
                        prevCounter = curCounter;
                    }
                    curCounter = 0;
                }
            }
            else{
                if(start) {
                    curCounter++;
                }
            }
            N = N/2;
        }
        return prevCounter;
    }

}
