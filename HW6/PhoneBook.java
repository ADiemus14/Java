//package HW6;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class phoneBook {
//    private Map<String, List<String>> map = new HashMap<>();
//
//    void add(String phoneNum, String name) {
//        if (map.containsKey(name)) {
//            List<String> phoneNumbers = map.get(name);
//            phoneNumbers.add(phoneNum);
//        } else {
//            List<String> phoneNumbers = new ArrayList<>();
//            phoneNumbers.add(phoneNum);
//            map.put(name, phoneNumbers);
//        }
//    }
//
//    String getPhoneNum(String phoneNum) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            List<String> phoneNumbers = entry.getValue();
//            if (phoneNumbers.contains(phoneNum)) {
//                stringBuilder.append(entry.getKey());
//                stringBuilder.append(" : ");
//                stringBuilder.append(entry.getValue());
//                stringBuilder.append("\n");
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    String getByName(String name) {
//        StringBuilder stringBuilder = new StringBuilder();
//        if (map.containsKey(name)) {
//            List<String> phoneNumbers = map.get(name);
//            for (String phoneNumber : phoneNumbers) {
//                stringBuilder.append(phoneNumber);
//                stringBuilder.append(" : ");
//                stringBuilder.append(name);
//                stringBuilder.append("\n");
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    String getAll() {
//        StringBuilder stringBuilder = new StringBuilder();
//        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet());
//        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
//        for (Map.Entry<String, List<String>> entry : entries) {
//            List<String> phoneNumbers = entry.getValue();
//            stringBuilder.append(entry.getKey());
//            stringBuilder.append(" : ");
//            stringBuilder.append(phoneNumbers);
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }
//
//}

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Иванов", "123-456-789");
        addContact(phoneBook, "Петров", "987-654-321");
        addContact(phoneBook, "Сидоров", "111-222-333");
        addContact(phoneBook, "Иванов", "555-555-555");
        addContact(phoneBook, "Петров", "999-999-999");

        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Телефоны: " + entry.getValue());
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }
}