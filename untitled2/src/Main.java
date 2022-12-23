import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(){};
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(12);
        list1.add(15);
        list1.add(20);
        list1.add(21);
        list1.add(22);

        List<Integer> list2 = new ArrayList<>(){};
        list2.add(-5);
        list2.add(-1);
        list2.add(9);
        list2.add(15);
        list2.add(100);

        List<Integer> list3 = new ArrayList<>(){};
        merge(list1,list2,list3);

        for (Integer i: list3) {
            System.out.println(i);
        }

    }

    private static void merge(List<Integer> l1,List<Integer> l2,List<Integer> dest){
        Collections.addAll(dest,l1.toArray(new Integer[0]));
        Collections.addAll(dest,l2.toArray(new Integer[0]));

        int n = dest.size();
        for (int i = 0; i < n - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++){
                if(dest.get(j) > dest.get(j + 1)){
                    int temp = dest.get(j);
                    dest.set(j, dest.get(j + 1));
                    dest.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}