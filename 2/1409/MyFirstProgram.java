import MyFirstPackage.*;

class MyFirstClass {
	public static void main(String[] s) {
		//for (int i = 0; i < s.length; i++)
 		//System.out.println(s[i]);

	MySecondClass o = new MySecondClass(5,10);
	int i, j;
	for (i = 1; i <= 8; i++) {
	for(j = 1; j <= 8; j++) {
		o.setX(i);
		o.setY(j);
		System.out.print(o.Method());
		System.out.print(" ");
	}
	System.out.println();
}


	}

}

