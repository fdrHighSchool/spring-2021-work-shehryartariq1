import java.util.*;
public class Driver{
  public static void main(String[] args){

    ArrayList<Point> List = new ArrayList<Point>();
    List.add(new Point());
    List.add(new Point(2,1));
    List.add(new Point(-4,1));
    List.add(new Point(3,-2));
    List.add(new Point(-3,-5));
    System.out.println(List);
    System.out.println(List.get(1).getX());
    System.out.println(List.get(3).getY());
    System.out.println(List.get(3).midpoint(List.get(4)));
  }
}
