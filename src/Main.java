public class Main {
    public static void main(String[] args) {
        CustomType customData = new CustomType("11.01.2005");
        Level2 objectA = new Level2(1, Color.RED, customData, "Объект A");
        Level3 objectB = new Level3(2, Color.GREEN, customData, "Объект B");
        Level3 objectC = new Level3(3, Color.BLUE, customData, "Объект C");

        // Вывод свойств объектов и вызов перегруженных методов
        System.out.println("Объект A характеристики: " + objectA.getId() + ", " + objectA.getName() + ", " + objectA.getColor() + ", " + objectA.getCustomData().getData());
        objectA.printInfo();

        System.out.println("Объект B характеристики: " + objectB.getId() + ", " + objectB.getName() + ", " + objectB.getColor() + ", " + objectB.getCustomData().getData());
        objectB.printInfo();

        System.out.println("Объект C характеристики: " + objectC.getId() + ", " + objectC.getName() + ", " + objectC.getColor() + ", " + objectC.getCustomData().getData());
        objectC.printInfo();
    }
}