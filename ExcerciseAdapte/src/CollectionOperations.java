import java.util.Set;

public class CollectionOperations {
    public int findMax(Set<Integer> numbers){
        int max = 0;
        for (Integer number : numbers
             ) {if (number>max){
                 max= number;
        }

        }
        return max;
    }

}
