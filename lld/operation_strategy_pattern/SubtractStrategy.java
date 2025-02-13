package operation_strategy_pattern;

public class SubtractStrategy extends Strategy {
    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
