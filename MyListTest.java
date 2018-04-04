import java.util.*;

public class MyListTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New	York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + "	");
        }
        List<String> arrayList = new ArrayList<>();
        arrayList.add("New	York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");
        System.out.println(arrayList);
        List<String> linkedList = new LinkedList<>();
        linkedList.add("New	York");
        linkedList.add("Atlanta");
        linkedList.add("Dallas");
        linkedList.add("Madison");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "	");
        }
    }
}
