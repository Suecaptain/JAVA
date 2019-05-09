import java.util.Scanner;
 
class Circle{
		private static double circle;
		public Circle(double r) {
			circle = r;
		}
		public static double CircleArea() {
			return circle*circle*3.1415;
		}
	}
	
public class shape{
		
	public static void main(String[] args) {
		
		System.out.print("请输入圆1的半径：");
		@SuppressWarnings("resource") 			//有泛型未指定类型
		Scanner scan1 = new Scanner(System.in);
		double r = scan1.nextInt();
		new Circle(r);			//引用类
		double C1 = Circle.CircleArea() ;
		System.out.println("计算得圆1的面积为："+Circle.CircleArea());
		
		System.out.print("请输入圆2的半径：");
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in);
		r = scan2.nextInt();
		new Circle(r);
		double C2 = Circle.CircleArea() ;
		System.out.println("计算得圆2的面积为："+Circle.CircleArea());
		
		System.out.print("请输入圆3的半径：");
		@SuppressWarnings("resource")
		Scanner scan3 = new Scanner(System.in);
		r = scan3.nextInt();
		new Circle(r);
		double C3 = Circle.CircleArea() ;
		System.out.println("计算得圆3的面积为："+Circle.CircleArea());
		
		double S = C1+C2+C3;
		System.out.println("计算得三个圆的面积和为为：" + S);
	}
}
