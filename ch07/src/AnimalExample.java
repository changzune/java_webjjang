
public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		dog.print();
		cat.sound();
		
		System.out.println("같은 트압의 변수 선언");
		
		//변수의 자동 타입 변환 
		Animal animal = null;
		//Dog Animal은 관련이 있다. - 캐스팅은 관련이 있는 데이터끼리만 가능
		//캐스팅 : 작 -> 큰 - 자동 캐스팅, 큰  -> 작 강제 캐스팅 : 데이터 손실이 있지만 
		//감수하고 데이터를 넣는다.
		//부모클래스 A 가 가지고 있는 A,B. A를 상속 받은 자식 클래스 B 가 가지고 있는 것 C, a,b(상속)
		//A는 a와 b를 가지고 있다. 해당되는 클래스는 ? A,B b는 A,B,C,를 자기고 있다. 해당되는 클래스?
		//A는관련이 있지만 c가 없어서 b 타입이라고 할 수 없다. b타입의 데이터를 A에 넣고 b타입으로 꺼낼때는 
		//강제 캐스팅 해야 한다.
		animal = new Dog();
		animal.sound();
		//Animal 클래스에는 존재하지 않는 메소드 이다.
		//animal.print();
		//큰 -> 작 : 강제 캐스팅 관련이 있어야 한다. 반드시 dog으로 생성이 되어져 있는 데이터 이여야만 한다.
		Dog d1 = (Dog) animal;
		d1.sound();
		//Cat c1 = (Cat) animal;//원래 넣어진 객체가 Dog엿으므로 Cat에 담을수 없다
		//Cat 생성해서 넣는다. 원래 있던 Dog는 어떻게? 덮어쓰게 된다.
		animal = new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	//dog , cat , animal을 전달 받아서 처리하는 매서드 -> 작,큰 : 자동 캐스팅 된다.
	public static void animalSound(Animal animal) {
		System.out.println("해당동물의 울음소리");
		animal.sound();
	}
	
	
	
}
