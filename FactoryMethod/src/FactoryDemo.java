public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal a1  = factoryAnimal.getAnimal("feline");
        System.out.println("Animal a1 soud: " + a1.makeSound());
        Animal a2 = factoryAnimal.getAnimal("canine");
        System.out.println("Animal a2 soud: " + a2.makeSound());
    }
}
