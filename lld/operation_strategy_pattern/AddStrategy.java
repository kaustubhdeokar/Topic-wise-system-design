package operation_strategy_pattern;

public class AddStrategy extends Strategy {
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
