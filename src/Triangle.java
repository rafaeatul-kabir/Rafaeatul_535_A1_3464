public class Triangle {
    private Point[] points = new Point[3];
    private double[] sides;
    private Type type;

    private void calculateSides(){
        for (Point point:points) {
            System.out.println(point);
        }
    }
    public void setType(Type type) {
        this.type = type;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public Type getType() {
        return type;
    }

}
