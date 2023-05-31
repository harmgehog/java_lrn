package homework6;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Laptop> setLaptops = new HashSet<>();

        setLaptops.add(new Laptop("Asus", "Ng2", 8512, 1024, "Windows", "Intel i5", "serial number 1"));
        setLaptops.add(new Laptop("Asus", "Nge4", 12512, 2024, "Ubuntu", "Intel i7", "serial number 2"));
        setLaptops.add(new Laptop("HP", "Hpavillion", 512, 512, "Windows", "AMD SX", "serial number 3"));
        setLaptops.add(new Laptop("Xiaomi", "Mibook", 2512, 1024, "Ubuntu", "AMD FX", "serial number 4"));
        setLaptops.add(new Laptop("Huawei", "pro max ultra super xs", 2512, 1024, "Windows", "Intel i5", "serial number 5"));
        setLaptops.add(new Laptop("Sony", "VAIO", 512, 512, "Windows", "Intel i3", "serial number 6"));

        setLaptops.add(new Laptop("Asus", "Ng2", 8512, 1024, "Windows", "Intel i5", "serial number 1"));
        setLaptops.add(new Laptop("Xiaomi", "Mibook", 2512, 1024, "Ubuntu", "AMD FX", "serial number 4"));


        setLaptopsFiltration(setLaptops, createFilter());
    }

    public static void setLaptopsFiltration(Set<Laptop> setLaptops, Laptop filterLaptop) {
        for (Laptop n : setLaptops) {
            if (n.getBrand().contains(filterLaptop.getBrand()) &&
                    n.getModel().contains(filterLaptop.getModel()) &&
                    n.getRam() >= filterLaptop.getRam() &&
                    n.getDisk() >= filterLaptop.getDisk() &&
                    n.getOs().contains(filterLaptop.getOs()) &&
                    n.getCpu().contains(filterLaptop.getCpu()) &&
                    n.getSerial().contains(filterLaptop.getSerial()))
                System.out.println(n);
        }
    }

    public static Laptop createFilter() {
        Laptop filterLaptop = new Laptop("", "", 0, 0, "", "", "");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите параметры:");
            System.out.println("1 - Производитель");
            System.out.println("2 - Модель");
            System.out.println("3 - ОЗУ");
            System.out.println("4 - Накопитель");
            System.out.println("5 - OC");
            System.out.println("6 - Процессор");
            System.out.println("7 - S/N");
            System.out.println("Любая другая цифра - Применить фильтр");
            System.out.print("-->");
            switch (scanner.nextInt()) {
                case 1 -> filterLaptop.setBrand(parameterValue("Производитель"));
                case 2 -> filterLaptop.setModel(parameterValue("Модель"));
                case 3 -> filterLaptop.setRam(Integer.parseInt(parameterValue("ОЗУ в МБайтах")));
                case 4 -> filterLaptop.setDisk(Integer.parseInt(parameterValue("Накопитель в МБайтах")));
                case 5 -> filterLaptop.setOs(parameterValue("ОС"));
                case 6 -> filterLaptop.setCpu(parameterValue("Процессор"));
                case 7 -> filterLaptop.setSerial(parameterValue("S/N:"));
                default -> flag = false;
            }
        }
        return filterLaptop;
    }

    private static String parameterValue(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение " + text + ":");
        return scanner.nextLine();
    }
}