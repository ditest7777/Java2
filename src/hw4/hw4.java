package hw4;

import java.util.*;

public class hw4 {

    public static void main(String[] args){
        List<String> allWords = Arrays.asList(
                "Яблоко", "Дом", "Кот", "Собака", "Кот",
                "Мяч", "Стол", "Мальчик", "Лес", "Смерть",
                "Дерево", "Яблоко", "Река", "Лодка", "Телефон",
                "Коза", "Дерево", "Широта", "Курс", "Книга"
        );

        Set<String> uniqueWords = new HashSet<String>(allWords);

        System.out.println("Все слова: " + allWords.toString());
        System.out.println("Уникальные слова: " + uniqueWords.toString());
        System.out.println("Каждое слово встречается: ");
        for (String key : uniqueWords) {
            System.out.println(key + ": " + Collections.frequency(allWords, key));
        }


        Phonebook phonebook = new Phonebook();

        phonebook.add("Краснова", "2514177");
        phonebook.add("Косолапов", "7898655");
        phonebook.add("Собакин", "55554411");
        phonebook.add("Цветкова", "787878787");
        phonebook.add("Цветкова", "66634422");

        System.out.println("Номер телефона Красновой" + phonebook.get("Краснова"));
        System.out.println("Номер телефона Косолапова" + phonebook.get("Косолапов"));
        System.out.println("Номер телефона Собакина" + phonebook.get("Собакин"));
        System.out.println("Номер телефона Цветковой" + phonebook.get("Цветкова"));
        System.out.println("Номер телефона Куликова" + phonebook.get("Куликов"));


    }


}
