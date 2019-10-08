//// You should write dependency by yourself. The method should return true or false if our boxer won or lost.
//// 1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;

package folder.HW5;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer () {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int s = 0;
        int n = 0;
        if (this.age > anotherBoxer.age) {
            s++;
        }
        else if(this.age < anotherBoxer.age) {
            n++;
        }
        if (this.weight > anotherBoxer.weight) {
            s++;
        }
        else if (this.weight < anotherBoxer.weight) {
            n++;
        }
        if (this.strength > anotherBoxer.strength) {
            s++;
        }
        else if(this.strength < anotherBoxer.strength) {
            n++;
        }

        if (s > n)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Boxer boxer1 = new Boxer();
        Boxer boxer2 = new Boxer();
        boxer1.age = 33;
        boxer2.age = 29;
        boxer1.weight = 70;
        boxer2.weight = 55;
        boxer1.strength = 100;
        boxer2.strength = 50;
        System.out.println(boxer1.fight(boxer2));
        System.out.println(boxer2.fight(boxer1));

    }
}