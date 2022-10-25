package src.smartgraduate;

public class basemethod {
	public static void main(String[] args) {
		derived c1=new derived();
		c1.useD();
	}

}
class base{
	String method()
	{
		return "wow";
	}
}
class derived{
	public void useD() {
		base z=new base();
		System.out.println("base says:"+z.method());
	}
}
