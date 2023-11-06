package lotto.controller;

import lotto.generator.RandomUniqueListGenerator;
import lotto.model.Lotto;
import lotto.model.LottoOwner;
import lotto.model.PurchasePrice;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        outputView.printEnterPurchaseAmount();
        PurchasePrice purchasePrice = PurchasePrice.from(inputView.getPurchaseAmount());
        LottoOwner lottoOwner = LottoOwner.of(purchasePrice, new RandomUniqueListGenerator());
        outputView.printLottosInfo(lottoOwner.getLottosInfo());
        outputView.printEnterWinningNumbers();
        Lotto winningLotto = Lotto.from(inputView.getWinningNumbers());
        outputView.printEnterBonusNumber();
        int bonusNumber = inputView.getBonusNumber();
    }
}
