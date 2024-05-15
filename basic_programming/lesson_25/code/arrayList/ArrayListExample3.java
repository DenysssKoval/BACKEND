package arrayList;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> stringsArrayList = new ArrayList<>();

        stringsArrayList.add("First");
        stringsArrayList.add("Second");
        stringsArrayList.add("Third");

        System.out.println(stringsArrayList);

        stringsArrayList.clear();

        stringsArrayList.add(0, "First");
        System.out.println(stringsArrayList);
        stringsArrayList.add(0, "Second");
        System.out.println(stringsArrayList);
        stringsArrayList.add(0, "Third");
        System.out.println(stringsArrayList);

        stringsArrayList.remove("First");
        System.out.println(stringsArrayList);

        stringsArrayList.set(0, "New Second Element");
        System.out.println(stringsArrayList);


    }
}
