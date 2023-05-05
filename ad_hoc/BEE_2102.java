
package ad_hoc;

import java.util.Scanner;
public class BEE_2102 {

    static int matriz [][] = new int[1001][101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        //quantidades de casos
        for(int w=0; w<t; w++)
        {
        int m,l;
        m=sc.nextInt();
        l=sc.nextInt();
        //Alocação de valores na matriz
        for(int i =0; i<l;i++)
        {
        int p,linha,coluna,v;
        p=sc.nextInt();
        linha=sc.nextInt();
        coluna=sc.nextInt();
        v=sc.nextInt();
        matriz[linha][coluna]+=v;
        }
        //impressão da posição e valor da matriz
        for(int i=0; i<m+1;i++)
        {
            for(int j=0; j<100;j++)
            {
                if(matriz[i][j]!=0)
                {
                    System.out.println(i+" "+j+" "+matriz[i][j]);
                    matriz[i][j]=0;
                }
            }
        }
        if(w!=t-1) System.out.println("");;
        }
    }
    
}
