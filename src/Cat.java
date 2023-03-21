public class Cat extends Animal{
    private boolean hasPlayedWith;

    public Cat(String name, int age, boolean vaccinated, boolean hasPlayedWith){
        super(name, age, vaccinated);
        this.hasPlayedWith = hasPlayedWith;
    }

    public void play(){
        hasPlayedWith = true;
        System.out.println("Let's go play!");
    }

    public boolean getHasPlayedWith(){
        return hasPlayedWith;
    }

}
