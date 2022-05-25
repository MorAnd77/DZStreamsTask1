import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> intermediateStorage = new ArrayList<>();

        StreamMain streamMain = new StreamMain();
        streamMain.streamList(intList);

        for (Integer counter : intList) {
            if (counter > 0 && (counter % 2) == 0) {
                intermediateStorage.add(counter);
            }
        }

        Collections.sort(intermediateStorage);

        for (Integer x : intermediateStorage) {
            System.out.println(x);
        }
    }
}
