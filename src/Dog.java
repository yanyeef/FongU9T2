public class Dog extends Animal{
    private boolean hasBeenWalked;

    public Dog(String name, int age, boolean vaccinated, boolean hasBeenWalked){
        super(name, age, vaccinated);
        this.hasBeenWalked  = hasBeenWalked;
    }

    public void walk(){
        hasBeenWalked = true;
        System.out.println("Time for a walk");
    }

    public boolean getHasBeenWalked(){
        return hasBeenWalked;
    }
}
