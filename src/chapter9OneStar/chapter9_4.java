package chapter9OneStar;
import java.util.Random;
public class chapter9_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random(1000);
		for (int i=0;i<50;i++) {
			System.out.print(ran.nextInt(100)+" ");
		}
	}

}
