public abstract class Car {
    private String name;
    private Color color;
    private int msxGuest;
    private int price;

    public Car(String name, Color color, int msxGuest, int price) {
        this.name = name;
        this.color = color;
        this.msxGuest = msxGuest;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMsxGuest() {
        return msxGuest;
    }

    public void setMsxGuest(int msxGuest) {
        this.msxGuest = msxGuest;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", msxGuest=" + msxGuest +
                ", price=" + price +
                '}';
    }
}
