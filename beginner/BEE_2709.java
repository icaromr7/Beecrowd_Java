
package beginner;

import java.util.Scanner;

public class BEE_2709 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()){
            int M=sc.nextInt();
            int V[]= new int[M];
            //Alocação das moedas
            for(int i=0;i<M;i++){
                V[i]=sc.nextInt();
            }
            int N=sc.nextInt();
            int pos=M-1;
            int x=0;
            int soma=0;
            //soma das moedas seguindo o salto
            while(pos>=0){
                soma+=V[pos];
                x++;
                pos=M-1-N*x;
            }
            int j=2;
            int raiz=(int)Math.sqrt(soma);
            //verificar se a soma é um número primo
            for(j=2;j<=raiz&&soma%j!=0;j++);
            if(j>raiz&&soma!=1)
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            else
                System.out.println("Bad boy! I’ll hit you.");
        }
    }
    
}
