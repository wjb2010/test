package test;

public class test {
	
	public void t(A a) {
		a.age=23;
		System.out.println("test中的a="+a.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t=new test();
		
	A a=new A();
	a.age=3;
	
	t.t(a);
	
	
	System.out.println(a.age);
	
//		System.out.println(t);
//		System.out.println(t2);
//		

	}

}
