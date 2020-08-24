public class main {

    public static void main(String[] args) {
        Human humanObject = new Human();
        System.out.println(humanObject.name);
        Food something = new Food(12, "pizza");
        humanObject.eat(something);
    }

}
