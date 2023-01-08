//works as public static final
interface Interface {
	double pi = 3.14;
}
class InstanceVarr implements Interface {
}
class Demo {
	public static void main(String[] args) {
		Interface ref;		
		InstanceVarr obj = new InstanceVarr();
		ref = obj;
		System.out.println(ref.pi);
	}
}
