package etc.lambda;

public class Apple {

    private int weight; // 무게
    private Color color; // 색상

    public Apple() {
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Apple apple = (Apple) object;
        return weight == apple.weight && color == apple.color;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), weight, color);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
