package Code;


public class CheckforPrivateOverriding {
		private  void test(){
			System.out.println("Inside A");
		}

		class B extends CheckforPrivateOverriding{
			private void test(){
				System.out.println("Inside B");
			}
		}

	public static void main(String[] args) {
		CheckforPrivateOverriding a = new CheckforPrivateOverriding();
		CheckforPrivateOverriding b=a.new B();
		b.test();
	}


}
