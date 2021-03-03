import java.util.*;

public class Point{

  //instance Variables
   private int x;
   private int y;

   // constructs a new point at the origin, (0, 0)
   public Point(){
     this(0,0); // calls Point(int, int) constructor
   }

   // constructs a new point with the given (x, y) location
   public Point(int x, int y) {
     setLocation(x, y);
   }


   // sets this point's (x, y) location to the given values
   public void setLocation(int x, int y) {
     this.x = x;
     this.y = y;
   }

   // returns the x-coordinate of this point
   public int getX() {
     return x;
   }

   // returns the y-coordinate of this point
   public int getY() {
     return y;
   }

   // returns the distance between this Point and (0, 0)
   public double distanceFromOrigin() {
     return Math.sqrt(x * x + y * y);
   }

   // shifts this point's location by the given amount
   public void translate(int dx, int dy) {
     setLocation(x + dx, y + dy);
   }


   public void distance(Point point) {
      return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
   }

   public void midpoint(Point point) {
     int mid=((this.x + point.getX())/2);
     int vid=((this.y + point.getY())/2);
     return new Point(mid,vid);
   }

   public void slope(Point point){
     return ((point.getY()-this.y)/(point.getX()-this.x));
   }

   public void isCollinear(Point point, Point point2){
     if (this.slope(point) == this.slope(point2)){
       return true;
     }
     return false;
   }

   // returns a String representation of this point
   public String toString() {
     return "(" + x + ", " + y + ")";
   }
 }
