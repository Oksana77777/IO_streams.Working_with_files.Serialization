import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 4, 3, 0, -2));

     /*   class MyComparator implements Comparator<Integer> {


            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        }
        Comparator<Integer> comparator = new MyComparator();

        Collections.sort(listOfIntegers, comparator);
*/
/*
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        };
*/

   //   Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o2, o1);
     // Comparator<Integer> comparator = new Comparator<Integer>() {

        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o2, o1);

       Collections.sort(listOfIntegers, comparator);

        System.out.println(listOfIntegers);

        MyFuncInterface myFuncInterface = (s) -> System.out.println(s);
        myFuncInterface.doSome("Привет мир!");

LogProducer logProducer = new LogProducer();
logProducer.logOut((Integer) -> true, (logString) -> logString);
    }

}


