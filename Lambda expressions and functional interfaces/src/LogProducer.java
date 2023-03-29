import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LogProducer {

    Random random = new Random( 42);

    public void logOut(Predicate<Integer> predicate, UnaryOperator<String> binaryOperator) {
        for (int i = 0; i < 10; i++) {
            int logNum = random.nextInt();

            String logString = "Новый лог: "+logNum;

            if (predicate.test(logNum))
                logString = binaryOperator.apply(logString);

            System.out.println(logString);
        }
    }
}
