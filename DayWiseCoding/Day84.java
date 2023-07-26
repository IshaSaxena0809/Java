package DayWiseCoding;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Day84 {
    public boolean isPossible(boolean [][] graph,int []color,int node,int col,int n){
        for(int i =0;i<n;i++){
            if(graph[node][i] && color[i]==col)return false;
        }
        return true;
    }
    public boolean solve(int node,boolean [][] graph,int []color,int m,int n){
        if(node ==n) return true;
        for(int i =1;i<=m;i++){
            if(isPossible(graph,color,node,i,n)){
                color[node]=i;
                if(solve(node+1,graph,color,m,n))return true;
                color[node]=0;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int []color = new int[n];
        return solve(0,graph,color,m,n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        int a,b;
        boolean graph[][] = new boolean[n][n];
        for(int i=1 ; i<=e ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            graph[a][b] = true;
            graph[b][a] = true;
        }
        Day84 obj =new Day84();
        if(obj.graphColoring(graph,m,n))
            System.out.print("1");
        else
            System.out.print("0");
    }

}
