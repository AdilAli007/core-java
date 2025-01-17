public class Box {

private int length;
private int width;

public void getLength(int l) {
this.length = l;
}

public void getWidth(int w) {
this.width = w;
}

public int getArea () {
int area = this.length * this.width;
return area;
}

public static void main(String arg[]) {

Box obj = new Box();

obj.getLength(5);
obj.getWidth(10);

System.out.println("Area of given length and width = " + obj.getArea());

}
}