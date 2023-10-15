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

        addContact(phoneBook, "Таня", "8-917-456-78-88");
        addContact(phoneBook, "База", "465-65-23");
        addContact(phoneBook, "Света", "8-654-265-46-12");
        addContact(phoneBook, "Безя", "8-756-452-12-32");
        addContact(phoneBook, "Нотя", "8-904-123-56-78");

        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println("Name: " + entry.getKey());
            System.out.println("Phone number: " + entry.getValue());
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }
}



