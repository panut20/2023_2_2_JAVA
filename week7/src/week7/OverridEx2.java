package week7;

class Weapon2{
public void Fire() {
	System.out.println("탕탕");
	}
}
class Laser2 extends Weapon2{
	public void Fire() {
		System.out.println("지이잉");
		super.Fire();
	}
}

public class OverridEx2 {
	public static void main(String[] args) {
		Laser2 a = new Laser2();
		a.Fire();

	}

}
