public class digui_xunhuan{
	public static void main(String[] args){
	long d3 = System.currentTimeMillis();
	int a = 10 ;
	int result =1;
	while(a>1){
		result *=a*(a-1);
		a-=2;
	}
	long d4 = System.currentTimeMillis();
	System.out.println(result);
	System.out.printf("��ͨѭ����ʱ��%s%n",d4-d3);
	
	
	
	}

}