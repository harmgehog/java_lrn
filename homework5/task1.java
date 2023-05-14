package homework5;

public class task1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь
    несколько телефонов.
     */
    public static void main(String[] args) {
        PhoneBook myPB = new PhoneBook();
        myPB.add("Иван", "Александрович", "Полстянов", "1234567890");
        myPB.add("Иван", "Александрович", "Полстянов", "0987654321");

        System.out.println(myPB.getL());
    }
}