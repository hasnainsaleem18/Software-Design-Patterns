
public class SingletonTest {

	 public static void main(String[] args) {
		    Singleton instance1 = Singleton.getInstance();
		    Singleton instance2 = Singleton.getInstance();

		    // Check if both instances refer to the same object
		    if (instance1 == instance2) {
		      System.out.println("Both instances are the same!");
		    }

		    instance1.doSomething();
		    instance2.doSomething();
		  }
}
