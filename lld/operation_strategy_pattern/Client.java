package operation_strategy_pattern;

public class Client {

    public static void main(String[] args) {


        StrategyMgr strategyMgr = new StrategyMgr(new AddStrategy());
        int res = strategyMgr.operate(1, 2);



    }
}
