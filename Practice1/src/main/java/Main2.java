import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
//        collection.add("first");
//        collection.add(0, "newFirst");
//        System.out.println(collection.size());
//        Set<String> names = new LinkedHashSet<>();
//        names.add("alex");
//        names.add("vova");
//        printHashSet(names);
        Map<Integer, String> mapCollection = new HashMap<>();

    }

    private static void printArrayList(List<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printHashSet(Set<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

