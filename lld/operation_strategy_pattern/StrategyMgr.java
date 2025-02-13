package operation_strategy_pattern;

public class StrategyMgr {

    public Strategy strategy;

    public StrategyMgr(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy(){
        return strategy;
    }

    public int operate(int a, int b){
        return strategy.operation(a, b);
    }

}
