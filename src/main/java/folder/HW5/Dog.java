//"3. Create a class Dog.
//The dog should have a name and an age (private).
//Create getters and setter for all the fields."

package folder.HW5;

public class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Dog() {
        }

        public void sayGuvGuv() {
            System.out.println("Гав-Гав!");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
