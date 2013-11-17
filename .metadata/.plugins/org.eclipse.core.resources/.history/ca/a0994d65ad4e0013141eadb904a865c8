import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	static void f(List<? extends Shape> list) {
		for(Shape s : list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {

//		List<Shape> list = new ArrayList<>();
		 List<? extends Shape> list = new ArrayList<>();
		 List<Circle> list2 = new ArrayList<Circle>();

		 
		list2.add(new Circle());
		list.add(new Polygon());
//		list2.add(new Ellipse());
		
		list = list2;
		
		f(list2);
		
		for (Shape shape : list) {
			shape.draw();
		}
	}
}
