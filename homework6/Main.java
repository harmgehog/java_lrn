package homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
        // методы. Реализовать в java.
        // Создать множество ноутбуков.

        Laptop nb1 = new Laptop(4, 1024, "Windows", "black");
        Laptop nb2 = new Laptop(8, 2048, "Linux", "red");
        Laptop nb3 = new Laptop(8, 4096, "MacOs", "blue");
        Laptop nb4 = new Laptop(32, 512, "Windows", "red");
        Laptop nb5 = new Laptop(64, 2048, "Linux", "yellow");


        Set<Laptop> laptops = new HashSet<>();
        laptops.add(nb1);
        laptops.add(nb2);
        laptops.add(nb3);
        laptops.add(nb4);
        laptops.add(nb5);

        for (Laptop lp : laptops) {
            System.out.println(lp);
        }

        filtration(laptops);

    }

    static void filtration(Set<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальный объем оперативной памяти или 0 ");
        int par1 = scanner.nextInt();

        System.out.println("Введите минимальный объем жесткого диска или 0");
        int par2 = scanner.nextInt();

        System.out.println(
                "Выберите ОС 0 не имеет значения 1 Windows 2 Linux 3 MacOs");
        int par03 = scanner.nextInt();
        String par3 = null;
        if (par03 == 1) {
            par3 = "Windows";
        }
        if (par03 == 2) {
            par3 = "Linux";
        }
        if (par03 == 3) {
            par3 = "MacOs";
        }

        System.out.println(
                "Введите цвет Ноутбука 0 без разницы 1 черный 2 красный 3 синий 4) желтый");
        int par04 = scanner.nextInt();
        String par4 = null;
        if (par04 == 1) {
            par4 = "black";
        }
        if (par04 == 2) {
            par4 = "red";
        }
        if (par04 == 3) {
            par4 = "blue";
        }
        if (par04 == 4) {
            par4 = "yellow";
        }

        Laptop idealLP = new Laptop(par1, par2, par3, par4);


        Set<Laptop> idealLp = new HashSet<>();

        for (Laptop lp : laptops) {
            if (lp.getRam() >= idealLP.getRam()
                    && lp.getHardDrive() >= idealLP.getHardDrive()) {
                if (idealLP.getOperationSystem() == null) {
                    if (idealLP.getColour() == null) {
                        idealLp.add(lp);
                    } else {
                        if (lp.getColour().equals(idealLP.getColour())) {
                            idealLp.add(lp);
                        }
                    }

                } else {
                    if (lp.getOperationSystem().equals(idealLP.getOperationSystem())
                            && idealLP.getColour() == null) {
                        idealLp.add(lp);
                    } else {
                        if (lp.getOperationSystem().equals(idealLP.getOperationSystem())
                                && idealLP.getColour().equals(lp.getColour())) {
                            idealLp.add(lp);
                        }
                    }
                }

            }

        }

        System.out.println("Подходящий ноут: ");
        for (Laptop el : idealLp) {
            System.out.println(el);
        }

    }

}