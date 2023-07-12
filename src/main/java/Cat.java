public class Cat extends Animal implements Pet{
    private String catName;

    public Cat(String name){
        super(4);
        catName=name;
    }

    public Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println("A cat eats fish.");
    }

    @Override
    public String getName() {
        return catName;
    }

    @Override
    public void setName(String name) {
        catName = name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing with a yarn ball.");
    }
}
