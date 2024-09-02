class Animal {
    class Dog {
        private String name="TEST";
        private String petName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();
        System.out.println(dog.getName());
    }
}
