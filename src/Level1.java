public class Level1 {
    private int id;
    private Color color;
    private CustomType customData;

    public Level1(int id, Color color, CustomType customData) {
        this.id = id;
        this.color = color;
        this.customData = customData;
    }

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public CustomType getCustomData() {
        return customData;
    }
}
