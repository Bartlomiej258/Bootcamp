package bootcamp.patterns.strategy;

import bootcamp.patterns.strategy.BuyPredictor;

public final class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
