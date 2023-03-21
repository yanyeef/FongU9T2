public class AnimalRunner {
    public static void main(String[]args){
        Animal animal = new Animal("Bob", 5, true);
        System.out.println(animal.getAge());
        System.out.println(animal.getName());
        System.out.println(animal.getVaccinated());
        animal.adopt();
        animal.feed();

        Cat c1 = new Cat("Mary", 3, false, false);
        System.out.println(c1.getHasPlayedWith());
        System.out.println(c1.getAge());
        System.out.println(c1.getName());
        System.out.println(c1.getVaccinated());
        c1.play();
        System.out.println(c1.getHasPlayedWith());
        c1.adopt();
        c1.feed();

        Dog d1 = new Dog("Tim", 7, false, true);
        System.out.println(d1.getHasBeenWalked());
        System.out.println(d1.getAge());
        System.out.println(d1.getName());
        System.out.println(d1.getVaccinated());
        d1.adopt();
        d1.feed();
    }
}
