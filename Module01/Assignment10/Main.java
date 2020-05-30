public class Main {

    public static void main(String[] args) {

        // Learning about classes & inheritance, in which a class calls parameters from another class. In this assignment
        //      we have class called Dog inheriting from the class Animal. 

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorky", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();


    }
}
