public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Barsic");
        Animal a1 = new Fish();
        Animal a2 = new Spider();
        Pet pet = new Cat();
        fish.setName("MyFish");
        fish.eat();
        System.out.println("This fish's name is "+fish.getName() + ".");
        fish.walk();
        cat.eat();
        System.out.println("This cat's name is "+cat.getName() + ".");
        cat.walk();
        ((Fish)a1).setName("MyFish2");
        a1.eat();
        System.out.println("This fish's name is "+((Fish)a1).getName() + ".");
        a1.walk();
        ((Spider)a2).eat();
        ((Spider)a2).walk();
        ((Cat)pet).setName("MyCat2");
        ((Cat)pet).eat();
        System.out.println("This cat's name is "+((Cat)pet).getName() + ".");
        ((Cat)pet).walk();
    }
}
