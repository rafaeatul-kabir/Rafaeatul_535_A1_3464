public class Triangle {
    private final Point[] points;
    private final double[] sides = new double[3];
    private Type type;

    /**
     *
     * @param points point object
     */
    public Triangle(Point[] points) {
        this.points = points;
        setType();
    }

    /**
     *
     * @param point1 point object
     * @param point2 point object
     * @return double value of the distance between two points passed as parameter
     */
    private double distanceBetweenTwoPoints(Point point1, Point point2){
        return Math.sqrt(Math.pow((point1.getxCoordinate()-point2.getxCoordinate()),2)+Math.pow((point1.getyCoordinate()-point2.getyCoordinate()),2));
    }
    private void calculateSides(){
        this.sides[0] = distanceBetweenTwoPoints(this.points[0], this.points[1]);
        this.sides[1] = distanceBetweenTwoPoints(this.points[1], this.points[2]);
        this.sides[2] = distanceBetweenTwoPoints(this.points[2], this.points[0]);
    }
    public void setType() {
        calculateSides();
        if (this.sides[0]==this.sides[2] && this.sides[1]==this.sides[0]){
            this.type=Type.EQUILATERAL;
        } else if (this.sides[0]==this.sides[1] || this.sides[1]==this.sides[2] || this.sides[2]==this.sides[0]) {
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

    public double getArea() {
        double x1 = this.points[0].getxCoordinate();
        double x2 = this.points[2].getxCoordinate();
        double x3 = this.points[1].getxCoordinate();

        double y1 = this.points[0].getyCoordinate();
        double y2 = this.points[2].getyCoordinate();
        double y3 = this.points[1].getyCoordinate();
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
    public boolean isInsideTriangle(Point p){
        //initiating a new array to store the sides from the new point
        double[] newSides= new double[3];
        newSides[0] = distanceBetweenTwoPoints(p,this.points[0]);
        newSides[1] = distanceBetweenTwoPoints(p,this.points[1]);
        newSides[2] = distanceBetweenTwoPoints(p,this.points[2]);

        //comparing the new sides if any of them is bigger than the old one
        if (newSides[0]>this.sides[0] || newSides[0]>this.sides[1] || newSides[0]>this.sides[2]) return false;
        if (newSides[1]>this.sides[0] || newSides[1]>this.sides[1] || newSides[1]>this.sides[2]) return false;
        if (newSides[2]>this.sides[0] || newSides[2]>this.sides[1] || newSides[2]>this.sides[2]) return false;
        return true;

    }



}
