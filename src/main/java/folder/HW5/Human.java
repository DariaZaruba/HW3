package folder.HW5;

public class Human {
    int weight;
    int age;
    String first_name;
    String last_name;
    int height;

    public Human() {
        weight = 55;
        age = 29;
        first_name = "Daria";
        last_name = "Zaruba";
        height = 55;
    }

    public static void main(String[] args) {
        Human myObj = new Human();
        System.out.println("Weight = " + myObj.weight);
        System.out.println("Age = " + myObj.age);
        System.out.println("First Name is " + myObj.first_name);
        System.out.println("Last Name is " + myObj.last_name);
        System.out.println("Height = " + myObj.height);
    }
}


