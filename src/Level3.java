public class Level3 extends Level2 {
    public Level3(int id, Color color, CustomType customData, String name) {
        super(id, color, customData, name);
    }

    // Перезаписанный метод
    @Override
    public void printInfo() {
        System.out.println("Level3: " + getId() + ", " + getName() + ", " + getColor() + ", " + getCustomData().getData());
    }
}
