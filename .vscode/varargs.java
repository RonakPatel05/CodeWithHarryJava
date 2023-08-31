public class varargs {
    static int sum(int x,int ...arr){        //argument ma int x lakhvthi ek arguument comperlsery thai jay che
        int result=0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }


public static void main(String[] args) {
  System.out.println("welcome to varargs tutorial");   
  System.out.println("thw sum of 4 and 5:"+ sum(  4,5));
  System.out.println("thw sum of 4 and 5:"+ sum(  4,5,6));
  System.out.println("thw sum of 4 and 5:"+ sum(  4,5,6,7));


}
}