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
		
		System.out.print("������Բ1�İ뾶��");
		@SuppressWarnings("resource") 			//�з���δָ������
		Scanner scan1 = new Scanner(System.in);
		double r = scan1.nextInt();
		new Circle(r);			//������
		double C1 = Circle.CircleArea() ;
		System.out.println("�����Բ1�����Ϊ��"+Circle.CircleArea());
		
		System.out.print("������Բ2�İ뾶��");
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in);
		r = scan2.nextInt();
		new Circle(r);
		double C2 = Circle.CircleArea() ;
		System.out.println("�����Բ2�����Ϊ��"+Circle.CircleArea());
		
		System.out.print("������Բ3�İ뾶��");
		@SuppressWarnings("resource")
		Scanner scan3 = new Scanner(System.in);
		r = scan3.nextInt();
		new Circle(r);
		double C3 = Circle.CircleArea() ;
		System.out.println("�����Բ3�����Ϊ��"+Circle.CircleArea());
		
		double S = C1+C2+C3;
		System.out.println("���������Բ�������ΪΪ��" + S);
	}
}
