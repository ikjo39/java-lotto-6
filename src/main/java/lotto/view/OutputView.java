package lotto.view;

import static lotto.constant.OutputText.ENTER_BONUS_NUMBER;
import static lotto.constant.OutputText.ENTER_PURCHASE_AMOUNT;
import static lotto.constant.OutputText.ENTER_WINNING_NUMBERS;
import static lotto.constant.OutputText.WINNING_STATISTICS;

import lotto.constant.OutputText;
import lotto.dto.LottosInfo;
import lotto.dto.WinningStatistics;

public class OutputView {

    public void printEnterPurchaseAmount() {
        printOutputText(ENTER_PURCHASE_AMOUNT);
    }

    public void printEnterWinningNumbers() {
        printOutputText(ENTER_WINNING_NUMBERS);
    }

    public void printEnterBonusNumber() {
        printSpace();
        printOutputText(ENTER_BONUS_NUMBER);
    }

    public void printLottosInfo(LottosInfo lottoInfos) {
        printText(lottoInfos.getLottoCountText());
        lottoInfos.numbers().forEach(this::printText);
        printSpace();
    }

    public void printWinnerStatistics() {
        printSpace();
        printOutputText(WINNING_STATISTICS);
    }

    public void printWinningStatistics(WinningStatistics winningStatistics) {
        printText(winningStatistics.convertOutputTextFormat());
    }

    private void printSpace() {
        System.out.println();
    }

    private void printText(String text) {
        System.out.println(text);
    }

    private void printOutputText(OutputText outputText) {
        System.out.println(outputText.toString());
    }
}
