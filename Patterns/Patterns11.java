public class Patterns11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0,x=n-1;i<n;i++,x--){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int j=(2*x+1);j>0;j--)
                System.out.print("*");
            System.out.println();
        }

    }
}
