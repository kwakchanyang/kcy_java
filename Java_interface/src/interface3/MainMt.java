package interface3;

public class MainMt {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Chicken();
		animal[3] = new Dog();
		
		for(Animal ani: animal) {
			ani.sound();
		}

	}

}


// 동물 소리
// 고양이 소리, 닭 소리, 강아지 소리
// 인터페이스 : Animals
// 클래스 : cat, chicken, dog