public class CircleGet{

public static void main (String args []){


Circle cl = new Circle();

cl.setBorderwidth(119);
cl.setColor("Yellow");
cl.setRadius(12.2);


System.out.println(cl.getBorderwidth());
System.out.println(cl.getColor());
System.out.println(cl.getRadius());

}
}