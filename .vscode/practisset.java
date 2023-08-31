public class practisset {

static void multiplication(int n){
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d\n",n,i,n*i );
    }
}

static int sumrec(int n){
    //base condition
    if(n==1){
        return 1;

    }
    
    return n+ sumrec(n-1);
}

static int fib(int n){
    if(n==1){
        return 0;
    }
    else if(n==2){
        return 1;
    }//be condition ek sathe lakva or lakhine return n-1 lakhva
    
    else{
        return fib(n-1)+fib(n-2);
    }
}

    public static void main(String[] args) {
      multiplication(5);  

      int c = sumrec(4);
      System.out.println("\nthe n number of sum is:"+c);


      int h=fib(5);
      System.out.println("\n the nth term of fibonaci serise:"+h);
    }
}
