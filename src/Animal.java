public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal(String name, int age, boolean vaccinated){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public void adopt(){
        System.out.println("You just adopted " + name + "!");
    }

    public void feed(){
        System.out.println("You just fed " + name + " food.");
    }
}
