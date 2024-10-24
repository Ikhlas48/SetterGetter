public class Circle{


private int borderwidth = 0;
private String color = null;
private Double radius = 0.0;


public void setBorderwidth(int borderwidth){
this.borderwidth = borderwidth;	
}

public void setColor(String color){
this.color = color;
}

public void setRadius(Double radius){
this.radius = radius;
}


public int getBorderwidth(){
return borderwidth;
}

public String getColor(){
return color;
}

public Double getRadius(){
return radius;
}


//CircleGet name ki class bhai hai value print krne ke liye

/*public static void main (String [] args){

Circle cl = new Circle();

cl.setBorderwidth(19);
cl.setColor("Yellow");
cl.setRadius(12.2);

System.out.println(cl.getBorderwidth());
System.out.println(cl.getColor());
System.out.println(cl.getRadius());

}*/
}
