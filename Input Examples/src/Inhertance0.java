
public class Inhertance0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class sample {
			private int a=10;
			int b=20;
			void display() {
				System.out.println(a+" "+b);
			}
		}
		class sample1 extends sample {
			void change() {
				a=30;
				b=40;                           
			}
		}

	}

}
