
package data_structures_and_libraries;

import java.util.Arrays;
import java.util.Scanner;

public class BEE_1025 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int nMamores,nConsultas;
		nMamores = sc.nextInt();
		nConsultas = sc.nextInt();
		int caso =1;
		while(nMamores != 0 && nConsultas != 0){
		    int [] n = new int [nMamores];
		    for(int i =0; i<nMamores;i++){
		        n[i]= sc.nextInt();
		    }
		    Arrays.sort(n);
		    System.out.println("CASE# "+caso+":");
		    for(int i =0; i < nConsultas ; i++){
		        int q= sc.nextInt();
		        int j=0;
		        for(j=0;j<nMamores&&n[j]!=q;j++);
		        if(j<nMamores){
		            for(j = 0; j < nMamores&&n[j] < q ; j++);
		            System.out.println(q+" found at "+(j+1));
		        }
		        else{
		            System.out.println(q+" not found");
		        }
		    }
		    caso++;
		    nMamores =sc.nextInt();
		    nConsultas=sc.nextInt();
		}
    }
    
}
