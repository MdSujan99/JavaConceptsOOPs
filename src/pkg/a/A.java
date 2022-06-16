package pkg.a;

public class A {
	int def;
	public int pub;
	private int pri;
	protected int pro;
	public A() {
		// TODO Auto-generated constructor stub
	}
	public A(int def, int pub, int pri, int pro) {
		super();
		this.def = def;
		this.pub = pub;
		this.pri = pri;
		this.pro = pro;
	}
	void getDetails() {
		System.out.println(this);
	}
	public void getDetailsPublic() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.def+"\n"+this.pub+"\n"+this.pri+"\n"+this.pro+"\n--------------";
	}
}
