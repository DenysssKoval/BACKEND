package task;

import java.util.ArrayList;

public class TVCollection {
    public static void main(String[] args) {

        ArrayList<TV> tvs = new ArrayList<>();


        tvs.add(new TV("Samsung", 47));
        tvs.add(new TV("LG", 42));
        tvs.add(new TV("LG", 50));


        System.out.println(tvs);
        System.out.println(tvs.size());

        String producerToMatch = "LG";
        for (int i = 0; i < tvs.size(); i++) {
            TV tv = tvs.get(i);
            if (tv.getProducer().equals(producerToMatch)) {
                tvs.remove(i);
                break;
            }
        }

        System.out.println(tvs);
        System.out.println(tvs.size());


    }
}
