package week7;

class soldier extends Weapon3{
	@Override
	void Fire() {
		System.out.println("탕탕탕");
	}
	void walk() {
		System.out.println("걷기");
	}
}

class Tank extends Weapon3{
	void Fire() {
		System.out.println("슈융펑");
	}
	void Forward() {
		System.out.println("위잉");
	}
}

class Fighter extends Weapon3{
	void Fire() {
		System.out.println("퍼퍼펑");
	}
	void Fly() {
		System.out.println("날기");
	}
}

public class AbsClsEx {
	public static void main(String[] args) {
		soldier s = new soldier();
		Tank t = new Tank();
		Fighter f = new Fighter();
		s.walk();
		s.Fire();
		t.Forward();
		t.Fire();
		f.Fly();
		f.Fire();
	}

}
