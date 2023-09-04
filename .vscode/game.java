import java.util.Random;
import java.util.Scanner;

public class game {
    private static int bound;

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Pater,2 for Scissor");
        int userinput=sc.nextInt();


        Random random=new Random();
       int coputerinput=random.nextInt(bound=3);

        if(userinput == coputerinput){
            System.out.println("Draw");
        }
        else if(userinput==0 && coputerinput==2||userinput==1&&coputerinput==0||userinput==2&&coputerinput==1){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win");
        }
        System.out.println("coputer Choice:"+ coputerinput);
    }
}
