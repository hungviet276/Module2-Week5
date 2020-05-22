import java.util.List;
import java.util.Set;

public class Client {
    private CollectionUtilsAdapter collectionUtilsAdapter;

    public Client(CollectionUtilsAdapter collectionUtilsAdapter) {
        this.collectionUtilsAdapter = collectionUtilsAdapter;
    }

    public void printMaxValue(List<Integer> numbers){
        int max = collectionUtilsAdapter.findMax(numbers);
        System.out.println("Max value is: " + max);
    }
}
