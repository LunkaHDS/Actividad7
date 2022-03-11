public class Fibonacci {
    public int [] i = new int [100];
    int x = 0;
    int y = 0;
    int piv = 1 ;
    public void ImpFibonacci(){
        for (int i = 0; i < 100; i++){
            System.out.print(String.valueOf(y)+ ", ");
            x = y;
            y = piv;
            piv = x + y ;
        }
    }
}

