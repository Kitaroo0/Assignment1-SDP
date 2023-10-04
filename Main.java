public class Main {
    public static void main(String[] args) {
        Singleton calculator = Singleton.getSingle();

        calculator.setOperation(new Minus());
        calculator.setResult(8, 2);

        //for check singleton
        Singleton counter2 = Singleton.getSingle();

        System.out.println("Result:" + counter2.getResult());
    }
}
