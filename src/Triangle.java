public class Triangle {
    private final Point[] points;
    private final double[] sides = new double[3];
    private Type type;

    public Triangle(Point[] points) {
        this.points = points;
        setType(this.sides);
    }
    private double distanceBetweenTwoPoints(Point point1, Point point2){
        return Math.sqrt(Math.pow((point1.getxCoordinate()-point2.getxCoordinate()),2)+Math.pow((point1.getyCoordinate()-point2.getyCoordinate()),2));
    }

    private void calculateSides(){
        this.sides[0] = distanceBetweenTwoPoints(this.points[0], this.points[1]);
        this.sides[1] = distanceBetweenTwoPoints(this.points[1], this.points[2]);
        this.sides[2] = distanceBetweenTwoPoints(this.points[2], this.points[0]);
    }
    public void setType(double[] sides) {
        calculateSides();
        if (sides[0]==sides[2] && sides[1]==sides[0]){
            this.type=Type.EQUILATERAL;
        } else if (sides[0]==sides[1] || sides[1]==sides[2] || sides[2]==sides[0]) {
            this.type=Type.ISOCELES;
        }
        else{
            this.type=Type.UNKNOWN;
        }
    }
    public Type getType() {
        return type;
    }
    public double getPerimeter(){
        return this.sides[0]+this.sides[1]+this.sides[2];
    }


}
