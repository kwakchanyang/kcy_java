package task;

import java.util.Scanner;

public class test0206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

      
        while (true) {
            a = (int) (Math.random() * 9 + 1);
            b = (int) (Math.random() * 9 + 1);
            c = (int) (Math.random() * 9 + 1);
            if (a != b && a != c && b != c) {
                break;
            }
        }

        int com = a * 100 + b * 10 + c; 

        int strike, ball, out; 

        int user1, user2, user3;

        do {
          
            System.out.println("숫자 3개 입력:");
            user1 = sc.nextInt();
            user2 = sc.nextInt();
            user3 = sc.nextInt();

            strike = 0;
            ball = 0;
            out = 0;

            // 1. 스트라이크 
            if (user1 == a || user2 == b || user3 == c) {
                strike++;

                if ((user1 == a && user2 == b) || (user1 == a && user3 == c) || (user2 == b && user3 == c)) {
                    strike++;
                }

                if (user1 == a && user2 == b && user3 == c) {
                    strike++;
                }
            }

            // 2. 볼 
            if (user1 == b || user1 == c || user2 == a || user2 == c || user3 == a || user3 == b) {
                ball++;

                if ((user1 == b && user2 == a) || (user1 == b && user3 == a) || (user2 == c && user3 == a)) {
                    ball++;
                }

                if ((user1 == b && user2 == c && user3 == a) || (user1 == c && user2 == a && user3 == b)) {
                    ball++;
                }
            }

            // 3. 아웃
            if (strike == 0 && ball == 0) {
                out = 3;
            } else if (strike == 1 || ball == 1) {
                out = 2;
            } else if (strike == 2 || ball == 2) {
                out = 1;
            }

            System.out.println(strike + " 스트라이크 " + ball + " 볼 " + out + " 아웃");

        } while (strike != 3);

        System.out.println("정답입니다! 정답: " + com);
    }
}
