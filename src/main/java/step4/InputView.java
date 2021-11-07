package step4;

import step3.GameInformation;
import step3.UserInput;

import java.util.Scanner;

public class InputView {

    public GameInformation input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        String timeStr = scanner.nextLine();

        UserInput userInput = UserInput.create(names, timeStr);
        userInput.validate();

        return GameInformation.create(userInput);
    }

}
