public class Animals {

        public String species;
        public String name;
        public int age;


        public Animals(String species, String name, int age) {
            this.species = species;
            this.name = name;
            this.age = age;
        }
    public String makeSound() {

        switch (species.toLowerCase()) {
            case "dog":
                return "Woof!";
            case "cat":
                return "Meow!";
            case "horse":
                return "¡Hiii, hiii!";
            case "snake":
                return "“sss”";
            default:
                return "Unknown sound";
        }
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old " + species;
    }

    public static void main(String[] args) {
        Animals animal1 = new Animals("Dog", "Buddy", 3);
        Animals animal2 = new Animals("Cat", "Whiskers", 5);
    }
}