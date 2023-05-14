package homework5;

import java.util.*;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();


    private void addData(String key, String value) {
        if (phoneBook.containsKey(key)) phoneBook.get(key).add(value);
        else {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(value);
            phoneBook.put(key, temp);
        }
    }

    public void add(String name, String patronym, String surname, String number) {
        addData((name + " " + patronym + " " + surname), number);
    }

    public void add(String name, String surname, String number) {
        addData((surname + " " + name), number);
    }

    public void add(String name, String number) {
        addData(name, number);
    }


    HashMap<String, ArrayList<String>> getL() {
        return phoneBook;
    }
}