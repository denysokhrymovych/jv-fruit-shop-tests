package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.handlers.OperationHandler;

public interface OperationStrategy {
    OperationHandler getHandler(FruitTransaction fruitTransaction);
}
