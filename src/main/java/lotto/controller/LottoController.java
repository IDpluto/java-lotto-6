package lotto.controller;

import java.util.Arrays;
import java.util.List;
import lotto.domain.Lotto;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    LottoService lottoService = new LottoService();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void playLotto() {

        int purchaseAmount = inputView.readPurchaseAmount();
        List<Lotto> lottoTickets = lottoService.purchaseLottoTickets(purchaseAmount);
        outputView.displayLottoTickets(lottoTickets);

    }

}
