package homework6;

public class Laptop {
    /*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    */
    private String brand;
    private String model;
    private int ram;
    private int disk;
    private String os;
    private String cpu;
    private String serial;

    Laptop(String brand, String model, Integer ram, Integer disk, String os,
           String cpu, String serial) {
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.ram = ram;
        this.disk = disk;
        this.os = os.toUpperCase();
        this.cpu = cpu.toUpperCase();
        this.serial = serial.toUpperCase();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.toUpperCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.toUpperCase();
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os.toUpperCase();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu.toUpperCase();
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial.toUpperCase();
    }

    @Override
    public String toString() {
        return "\n" + brand + "_" + model + "_RAM_" + ram + "_HDD_"
                + disk + "_" + os + "_CPU_" + cpu + "_S/N: " + serial;// + "_HashCode_" + hashCode();
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode() * 3 + ram * 7
                + disk * 11 + os.hashCode() * 13 + cpu.hashCode() * 17 + serial.hashCode() * 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return brand.equals(laptop.brand) && model.equals(laptop.model) &&
                ram == laptop.ram && disk == laptop.disk &&
                os.equals(laptop.os) && cpu.equals(laptop.cpu) &&
                serial.equals(laptop.serial);
    }
}