package study0211;

public class JavaHomwork {
    public static void main(String[] args) {
        int[] num = new int[15]; // 15개의 정수를 저장할 배열
        int idx = 0; // 현재 저장된 숫자의 개수

        // 무한 루프 시작
        while (true) {
            int temp = (int)(Math.random() * 50 + 1); // 1부터 50까지 랜덤 숫자 생성

            // 짝수인지 확인
            if (temp % 2 == 0) {
                boolean isSame = false; // 중복 여부 체크 변수 초기화

                // 배열에 이미 저장된 숫자와 비교
                for (int i = 0; i < idx; i++) {
                    if (num[i] == temp) {
                        isSame = true; // 중복이면 true로 설정
                        break; // 중복을 찾았으므로 반복 종료
                    }
                }

                // 중복이 아니면 배열에 저장
                if (!isSame) {
                    num[idx++] = temp; // 짝수를 배열에 추가하고 인덱스 증가
                }
            }

            // 배열이 가득 차면 루프 종료
            if (idx == num.length) {
                break; // idx가 배열 크기와 같으면 종료
            }
        }

        // 배열의 모든 값 출력
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
