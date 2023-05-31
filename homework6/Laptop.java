package homework6;

//public class Laptop {
//    // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
//    // методы. Реализовать в java.
//    // Создать множество ноутбуков.
//
//
//    private int ram;
//    private int hardDrive;
//    private String operationSystem;
//    private String colour;
//
//    public Laptop(int ram, int hardDrive, String operationSystem, String string) {
//        this.ram = ram;
//        this.hardDrive = hardDrive;
//        this.operationSystem = operationSystem;
//        this.colour = string;
//    }
//
//    public String getColour() {
//        return colour;
//    }
//
//    public int getHardDrive() {
//        return hardDrive;
//    }
//
//    public String getOperationSystem() {
//        return operationSystem;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public void setColour(String colour) {
//        this.colour = colour;
//    }
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setHardDrive(int hardDrive) {
//        this.hardDrive = hardDrive;
//    }
//
//    public void setOperationSystem(String operationSystem) {
//        this.operationSystem = operationSystem;
//    }
//
//    @Override
//    public String toString() {
//        // TODO Auto-generated method stub
//        return "ОЗУ: " + ram + ", Накопитель: " + hardDrive + ", ОС: " + operationSystem + ", Цвет: " + colour;
//    }
//
//}


public class Notebook {
    /*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 отвечающие фильтру. Критерии фильтрации можно хранить в Map.
  Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    */
    private String brand;
    private String notebook_model;
    private int ram_capacity;
    private int hdd_capacity;
    private String os;
    private String cpu_model;
    private String serial_number;

    Notebook(String brand, String notebook_model, Integer ram_capacity, Integer hdd_capacity, String os,
             String cpu_model, String serial_number) {
        this.brand = brand.toUpperCase();
        this.notebook_model = notebook_model.toUpperCase();
        this.ram_capacity = ram_capacity;
        this.hdd_capacity = hdd_capacity;
        this.os = os.toUpperCase();
        this.cpu_model = cpu_model.toUpperCase();
        this.serial_number = serial_number.toUpperCase();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.toUpperCase();
    }

    public String getNotebook_model() {
        return notebook_model;
    }

    public void setNotebook_model(String notebook_model) {
        this.notebook_model = notebook_model.toUpperCase();
    }

    public Integer getRam_capacity() {
        return ram_capacity;
    }

    public void setRam_capacity(int ram_capacity) {
        this.ram_capacity = ram_capacity;
    }

    public Integer getHdd_capacity() {
        return hdd_capacity;
    }

    public void setHdd_capacity(int hdd_capacity) {
        this.hdd_capacity = hdd_capacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os.toUpperCase();
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model.toUpperCase();
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number.toUpperCase();
    }

    @Override
    public String toString() {
        return "\n" + brand + "_" + notebook_model + "_RAM_" + ram_capacity + "_HDD_"
                + hdd_capacity + "_" + os + "_CPU_" + cpu_model + "_S/N: " + serial_number;// + "_HashCode_" + hashCode();
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + notebook_model.hashCode() * 3 + ram_capacity * 7
                + hdd_capacity * 11 + os.hashCode() * 13 + cpu_model.hashCode() * 17 + serial_number.hashCode() * 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return brand.equals(notebook.brand) && notebook_model.equals(notebook.notebook_model) &&
                ram_capacity == notebook.ram_capacity && hdd_capacity == notebook.hdd_capacity &&
                os.equals(notebook.os) && cpu_model.equals(notebook.cpu_model) &&
                serial_number.equals(notebook.serial_number);
    }
}