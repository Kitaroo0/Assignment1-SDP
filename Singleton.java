public class Singleton {
    private static Singleton single;
    private int result;
    private Singleton() {
        result = 0;
    }

    public static Singleton getSingle() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setResult(int a, int b) {
        result = operation.execute(a, b);
    }
    public int getResult() {
        return result;
    }

}