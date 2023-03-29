import java.util.function.Consumer;

class Main {

public Main(String string) {
        System.out.println(string);
        }
public static void main(String[] args) {
        Consumer<String> sayable = Main:: new;
        sayable.accept( "Hello, this is Main class");
        }
        }