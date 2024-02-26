package matrixTest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        IBuyLotto buy = new BuyLotto();
        int[] myLotto = buy.myBuyLotto();
        System.out.println("로또 번호 6개를 입력하세요(1부터 45까지):");
        buy.myBuyLotto(myLotto);

        ILottoDraw draw = new LottoDraw();
        int[] lottoNumbers = draw.createRandomLotto(); // 랜덤으로 번호 생성
        int[] sortedLottoNumbers = draw.sortAscending(lottoNumbers);

        System.out.println("입력된 로또 번호:");
        draw.printLotto(myLotto); // 내가 입력한 번호 출력

        System.out.println("랜덤으로 나온 로또 번호:");
        draw.printLotto(sortedLottoNumbers); // 랜덤으로 생성된 번호 출력

        ILottoMatch match = new LottoMatch();
        int sameCount = match.findSame(sortedLottoNumbers, myLotto);
        String rank = match.rank(sameCount);
        System.out.println("당첨 결과: " + rank);
    }
}

class LottoDraw implements ILottoDraw {
    @Override
    public void printLotto(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public int[] sortAscending(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    @Override
    public int[] createRandomLotto() {
        int[] lottoNumbers = new int[6];
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 수 생성
            } while (isDuplicate(lottoNumbers, randomNumber)); // 중복 체크
            lottoNumbers[i] = randomNumber; // 중복되지 않은 숫자를 배열에 추가
        }
        return lottoNumbers;
    }

    // 중복 체크 메서드
    private boolean isDuplicate(int[] arr, int number) {
        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}

class LottoMatch implements ILottoMatch {
    @Override
    public int findSame(int[] originLotto, int[] myLotto) {
        int count = 0;
        for (int num : myLotto) {
            if (contains(originLotto, num)) {
                count++;
            }
        }
        return count;
    }

    private boolean contains(int[] arr, int number) {
        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String rank(int count) {
        switch (count) {
            case 6:
                return "1등";
            case 5:
                return "2등";
            case 4:
                return "3등";
            case 3:
                return "4등";
            default:
                return "꽝";
        }
    }
}

class BuyLotto implements IBuyLotto {
    @Override
    public int[] myBuyLotto() {
        return new int[6];
    }

    @Override
    public void myBuyLotto(int[] buyLotto) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d번째 숫자: ", i + 1);
            buyLotto[i] = scanner.nextInt();
        }
    }
}

interface IBuyLotto {
    int[] myBuyLotto();
    void myBuyLotto(int[] buyLotto);
}

interface ILottoDraw {
    int[] createRandomLotto();
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr);
}

interface ILottoMatch {
    int findSame(int[] originLotto, int[] myLotto);
    String rank(int count);
}
