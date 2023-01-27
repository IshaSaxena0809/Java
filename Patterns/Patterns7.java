public class Patterns7 {
    public static void main(String[] args) {
        int n=5,x=1;
        for(int i=1; i<=n;i++){
            for(int j=0;j<i;j++,x=2-x){
                System.out.print((x++)+" ");
            }
            System.out.println();
        }
    }
}
/*
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1

 */