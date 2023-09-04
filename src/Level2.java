public class Level2 extends Level1 {
    private String name;

    public Level2(int id, Color color, CustomType customData, String name) {
        super(id, color, customData);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Перегруженный метод, неперезаписываемый
    public void printInfo() {
        System.out.println("Level2: " + getId() + ", " + getName() + ", " + getColor() + ", " + getCustomData().getData());
    }
}
