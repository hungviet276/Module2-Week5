import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(1);
       list.add(2);
       list.add(11);
       list.add(10);
       list.add(8);
    Client client = new Client(new CollectionUtilsAdapter());
    client.printMaxValue(list);

    }
}
