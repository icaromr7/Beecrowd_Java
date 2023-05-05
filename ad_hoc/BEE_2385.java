
package ad_hoc;

import java.util.Scanner;

public class BEE_2385 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N, P, Q, R, S, X, Y, I, J, i;
            N = sc.nextLong();
            P = sc.nextLong();
            Q = sc.nextLong();
            R = sc.nextLong();
            S = sc.nextLong();
            X = sc.nextLong();
            Y = sc.nextLong();
            I = sc.nextLong();
            J = sc.nextLong();

            long A,B,C;//representação para cada matriz.
            C= 0;

            for (i = 1; i <= N; i++) {

                    A = (P * I + Q * i) % X;
                    B = (R * i + S * J) % Y;
                    C = C+ A* B;
            }
            
            System.out.println(C);
    }
    
}
