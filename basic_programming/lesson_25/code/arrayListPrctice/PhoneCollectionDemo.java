package code.arrayListPrctice;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один элемент по индексу
        удалить один элемент по объекту
         */


        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(1,"iPhone 13 Max Pro", "Apple", 1250.0));

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(2,"iPhone 14 Max Pro", "Apple", 1350.0));
        phones.add(new Phone(3,"iPhone 15 Max Pro", "Apple", 1550.0));
        phones.add(new Phone(4,"Galaxy", "Samsung", 1100.0));
        phones.add(new Phone(5,"G6", "Huawei", 900.0));

        System.out.println(phones);
        System.out.println(phones.size());

        System.out.println(phones.get(2));

        phones.remove(2);

        System.out.println(phones);

        System.out.println(phones.get(2));


    }
}