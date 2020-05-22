import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter {
    private CollectionOperations collectionOperations = new CollectionOperations();
    public int findMax(List<Integer> numbers){
        Set<Integer> set = new HashSet<>();
        for (Integer number:numbers
             ) {set.add(number);

        }
        return collectionOperations.findMax(set);
    }
}
