public class Fish extends Animal implements Pet {

    private String fishName;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats worms.");
    }

    @Override
    public String getName() {
        return fishName;
    }

    @Override
    public void setName(String name) {
        fishName = name;
    }

    @Override
    public void play() {
        System.out.println("The fish actually doesn't like to play.");
    }

    @Override
    public void walk(){
        System.out.println("Fish can't walk. They don't have legs.");
    }
}
