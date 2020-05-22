import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;
    public void printRandomEvenList(int size, int min, int max){
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
        randomList = new RandomList();
        randomNumber = new RandomNumber();
        List<Integer> numbers = new ArrayList<>();
        numbers = listFilter.filterOdd(randomList.generateList(size,min,max));
        listPrinter.printList(numbers);

    }
}
