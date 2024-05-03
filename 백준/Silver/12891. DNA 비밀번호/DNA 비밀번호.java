import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
ACGT문자열

CCTGGATTG

A C G T
2 0 1  1

배열과 문자열에 포인터를 둔다.

문자열을 부분문자열의 길이만큼 나누는 포인터를 갖는다.
하나의 로직이 끝나면 부분문자열의 위치를 뒤로 한칸씩 밀어가며 비교한다.

로직
ACGT 횟수 배열은 돌아가며 부분문자열에 해당 문자열이 모두 들어있는지확인한다.



 */
public class Main {
    static int P,S;
    static char[] str;
    static int[] arr = new int[4];
    static int answer =0;
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        str = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt=0;
        int rt=P-1;

            int[] ex = new int[4];

            for (int i = 0; i <P; i++) {
                if (str[i] == 'A') {
                    ex[0]++;
                } else if (str[i] == 'C') {
                    ex[1]++;
                } else if (str[i] == 'G') {
                    ex[2]++;
                } else if (str[i] == 'T') {
                    ex[3]++;
                }
            }


        for (int i = 0; i <=S-P ; i++) {

            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= ex[j]) {
                    flag= true;
                }else{
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
            if(i==S-P) break;

            ex[pos(str[i])]--;
            ex[pos(str[i+P])]++;



        }

        System.out.println(answer);

    }

    private static int pos(char c) {
        switch(c) {
            case 'A' : return 0;
            case 'C' : return 1;
            case 'G' : return 2;
            case 'T' : return 3;
        }
        return -1;
    }
    }

