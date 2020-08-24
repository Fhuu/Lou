public class Human
{
    //field : global variable, which can be acessed from this whole class,
    //and is the attribute of an object
    public String name;
    public int height, weight;
    public String gender;
    public int hunger;

    //constructor, attribute from class,
    //for example human has name, height, weight, gender
    //Scanner userInput = new Scanner(System.in);
    //new Scanner(System.in); is calling constructor
    //Constructor is also a methode/function
    //System.in is the parameter.
    //To write a constructor:
    //Constructor's name is always the same as the class' name and in capital
    //Constructor is also a methode
    public Human(String name, int height, int weight, String gender, int hunger) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.hunger = hunger;
    }

    public Human() {
        this.name = "andre";
        this.height = 176;
        this.weight = 82;
        this.gender = "male";
        this.hunger = 0;
    }

    //method or function in default programming language
    public void printName() {
        System.out.println(this.name);
    }

    //calorie = 12, foodName = pizza
    public void eat(Food something) {
        if(this.hunger < 100) {
            System.out.println(this.name + " has eaten " + something.foodName);
            this.hunger = this.hunger + something.calorie;
            System.out.println(this.name + " has added " + something.calorie + " calories.");
        } else {
            System.out.println(this.name + " is full and cannot eat anything.");
        }
    }
}
