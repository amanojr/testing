package javaPractice;

public class childSuper extends parentSuper {
	
	public void ClassCl()
	{
		System.out.println("Unique childsuper class");
	}
	public void Class1()
	{
		System.out.println("common childsuper class");
	}

	public static void main(String[] args) {
		parentSuper cls = new childSuper();
		cls.ClassP0();;
	}

}
