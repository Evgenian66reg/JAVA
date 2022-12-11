import ru.top.oop.DivArrays;

public class Main {
    public static void main(String[] args)
    {
        double[] arr1 = {22.4};
        double[] arr2 = {44.5};
        DivArrays divArrays = new DivArrays(13,arr1,33,arr2);
        divArrays.Division();
        System.out.println(divArrays);
    }
}