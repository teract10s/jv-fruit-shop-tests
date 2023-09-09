package core.basesyntax.strategy.handler;

import core.basesyntax.model.FruitTransaction;

public class ReturnHandler implements OperationHandler {
    @Override
    public void process(FruitTransaction fruit) {
        SHOP_SERVICE.addFruits(fruit.getFruit(), fruit.getQuantity());
    }
}