package week7;

class Weapon {
	public void Fire() {
		System.out.println("탕탕");
	}
}
class Bomb extends Weapon{
	public void Fire() {
		System.out.println("펑펑");
	}
}
class Laser extends Weapon{
	public void Fire() {
		System.out.println("지이이잉");
	}
}

public class OverridEx1 {
	public static void main(String[] args) {
		Weapon a = new Weapon();
		Bomb b = new Bomb();
		Laser c = new Laser();
		a.Fire();
		b.Fire();
		c.Fire();
	}

}
