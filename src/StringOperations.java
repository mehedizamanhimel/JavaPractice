import java.util.ArrayList;
import java.util.Arrays;

public class StringOperations {

    public void removeSubString() {
        ArrayList<String> listString1 = new ArrayList<>(Arrays.asList("mass", "as", "hero", "superhero"));
        System.out.println(listString1);
        ArrayList<String> listString2 = new ArrayList<>(Arrays.asList());
        String str = String.join(" ", listString1);
        for (int i = 0; i < listString1.size(); i++) {
            for (int j = i + 1; i < listString1.size(); i++) {
                if (listString1.get(i).charAt(i) == listString1.get(j).lastIndexOf(i)) {
                    listString2.add(listString1.get(i));
                }
            }
            break;
        }
        System.out.println(listString2);
    }
}
