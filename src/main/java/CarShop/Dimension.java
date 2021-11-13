package CarShop;

public class Dimension {
    private final int height;
    private final int width;
    private final int tankCapaity;


    public Dimension(int height, int width, int tankCapaity) {
        this.height = height;
        this.width = width;
        this.tankCapaity = tankCapaity;
    }

    public int getTankCapaity() {
        return tankCapaity;
    }
}

