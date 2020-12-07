package step2.view;

import step2.domain.LottoNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    public static int inputPurchasePrice() {
        return sc.nextInt();
    }

    public static List<LottoNumber> inputWinNumber() {
        List<LottoNumber> numbers = new ArrayList<>();

        sc.nextLine();
        String[] winNumbers = sc.nextLine().split(", ");

        for (int i = 0; i < winNumbers.length; i++) {
            numbers.add(LottoNumber.of(Integer.parseInt(winNumbers[i])));
        }
        return numbers;
    }
}