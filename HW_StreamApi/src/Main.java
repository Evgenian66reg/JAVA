import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1 //
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");
        list.add("a4");
        list.add("a5");
        list.add("a1");
        int count = Collections.frequency(list,"a1");
        System.out.println("Retry a1 = " + count);*/

        // 2 //
        //System.out.println(Stream.of("a1", "a2", "a3", "a1", "a4", "a5", "a1").filter(n->n.contains("a3")).findFirst().orElse("Not found"));

        // 3 //
        //System.out.println(Stream.of("a1", "a2", "a3", "a1", "a4", "a5", "a1","x3").reduce((first,second)->second).orElse(null));

        // 4 //
        /*System.out.println(Stream.of("Bicycle","Bus","Train","Motorcycle","Trolleybus","Snowmobile","Truck")
                                  .skip(1).limit(2).collect(Collectors.toList()));*/

        // 5 //
        /*List<String> list = new ArrayList<>();
        list.add("Виктор");
        list.add("Олег");
        list.add("Дмитрий");
        list.add("Евгений");
        list.add("Олег");
        list.add("Ольга");
        list.add("Виктор");
        System.out.println("List name not retry " + list.stream().distinct().collect(Collectors.toList()) + "\n");
        System.out.println("Averaging length name " + list.stream().collect(Collectors.averagingInt(String::length)));*/

        // 6  //
        /*List<String> list = new ArrayList<>();
        list.add("Виктор");
        list.add("Олег");
        list.add("Дмитрий");
        list.add("Евгений");
        list.add("Олег");
        list.add("Ольга");
        list.add("Виктор");
        System.out.println(list.stream().sorted((n1,n2)->n2.compareTo(n1)).distinct().collect(Collectors.toList()));*/

        // 7 //
        /*System.out.println(Stream.of("1","3","22","4","5","16","15","44")
                .mapToInt(Integer::parseInt).filter(n-> n%2 != 0).sum());*/
    }
}