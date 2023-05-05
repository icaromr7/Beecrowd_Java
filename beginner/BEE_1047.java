
package beginner;

import java.util.Scanner;

public class BEE_1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial,minutoInicial,horaFinal,minutoFinal,tempoInicial,tempoFinal;
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();
        tempoInicial = horaInicial * 60 + minutoInicial;
        tempoFinal = horaFinal * 60 + minutoFinal;
        int diferençaTempos = tempoFinal - tempoInicial;
        if (tempoInicial == tempoFinal){
        System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if (tempoFinal>tempoInicial){
            int A = (diferençaTempos)/60;
            int B = (diferençaTempos)%60;
            System.out.println("O JOGO DUROU " + A + " HORA(S) E " + B + " MINUTO(S)");
        }
        else if (tempoInicial>tempoFinal){
            int A = (1440+diferençaTempos)/60;
            int B = (1440+diferençaTempos)%60;
            System.out.println("O JOGO DUROU " + A + " HORA(S) E " + B + " MINUTO(S)");
        }
    }
    
}
