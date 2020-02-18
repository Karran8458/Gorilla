public class Gorilla extends Mammal {
	public void Gorilla(int energy) {
    this.energy = energy;
    }
	public void throwSomething() {
	System.out.println("The gorilla has thrown something");
	this.energy = this.energy - 5;
	}
	public void eatBananas() {
	System.out.println("The gorilla is happy");
	this.energy = this.energy + 10;
	}
	public void climb() {
	this.energy = this.energy - 10;
	System.out.println("The gorilla has climbed a tree");
	}
}
