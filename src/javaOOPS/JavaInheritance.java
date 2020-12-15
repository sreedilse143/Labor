package javaOOPS;

class B1 {

	protected String mystr = "akula";
	private int id = 1;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getMystr() {
		return mystr;
	}

	protected void setMystr(String mystr) {
		this.mystr = mystr;
	}
}

class A1 extends B1 {

	protected String mystr = "srikanth";

	protected String getMystr() {
		return mystr;
	}

	protected void setMystr(String mystr) {
		this.mystr = mystr;
	}

}

class JavaInheritance extends A1 {
	public static void main(String args[]) {

		JavaInheritance o = new JavaInheritance();

		System.out.println(o.getMystr());
		System.out.println(o.getId());
	}

}
