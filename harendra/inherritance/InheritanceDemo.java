package inherritance;

class Animal {
    protected String name;
    protected int age;
    
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }
    
    // Methods
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class 1 (Single Inheritance)
class Dog extends Animal {
    private String breed;
    
    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Calling parent class constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    
    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
    
    // Method overriding
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food");
    }
    
    // Additional method to display dog-specific info
    public void displayDogInfo() {
        displayInfo(); // Calling parent method
        System.out.println("Breed: " + breed);
    }
}

// Child class 2 (Hierarchical Inheritance)
class Cat extends Animal {
    private boolean isIndoor;
    
    // Constructor
    public Cat(String name, int  age, boolean isIndoor) {
        super(name, age);
        
        this.isIndoor = isIndoor;
        System.out.println("Cat constructor called");
    }
    
    // Additional method specific to Cat
    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
    
    // Method overriding
    @Override
    public void sleep() {
        System.out.println(name + " the cat is sleeping on the sofa");
    }
    
    public void displayCatInfo() {
        displayInfo();
        System.out.println("Indoor cat: " + (isIndoor ? "Yes" : "No"));
    }
}

// Another child class demonstrating Multilevel Inheritance
class Puppy extends Dog {
    private boolean isTrained;
    
    public Puppy(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
        System.out.println("Puppy constructor called");
    }
    
    @Override
    public void bark() {
        System.out.println(name + " the puppy is barking softly: yip! yip!");
    }
    
    public void displayPuppyInfo() {
        displayDogInfo();
        System.out.println("House trained: " + (isTrained ? "Yes" : "No"));
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== SINGLE INHERITANCE DEMONSTRATION ===");
        System.out.println();
        
        // Creating objects
        Dog myDog = new Dog("Ma.  x", 3, "Golden Retriever");
        System.out.println();
        
        // Calling methods
        myDog.displayDogInfo();
        myDog.eat(); // Overridden method
        myDog.sleep(); // Inherited method
        myDog.bark(); // Child class method
        System.out.println();
        
        System.out.println("=== HIERARCHICAL INHERITANCE DEMONSTRATION ===");
        System.out.println();
        
        Cat myCat = new Cat("Whiskers", 2, true);
        System.out.println();
        myCat.displayCatInfo();
        myCat.eat(); // Inherited method
        myCat.sleep(); // Overridden method
        myCat.meow(); // Child class method
        System.out.println();
        
        System.out.println("=== MULTILEVEL INHERITANCE DEMONSTRATION ===");
        System.out.println();
        
        Puppy myPuppy = new Puppy("Charlie", 1, "Labrador", false);
        System.out.println();
        myPuppy.displayPuppyInfo();
        myPuppy.eat(); // Inherited from Dog (which overrides Animal)
        myPuppy.sleep(); // Inherited from Animal
        myPuppy.bark(); // Overridden in Puppy
        System.out.println();
        
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");
        System.out.println();
        
        // Polymorphism - Parent reference, child object
        Animal animal1 = new Dog("Buddy", 4, "German Shepherd");
        Animal animal2 = new Cat("Luna", 3, false);
        
        // This will call the overridden methods
        animal1.eat();
        animal2.sleep();
        
        // Cannot call child-specific methods with parent reference
        // animal1.bark(); // This would cause compilation error
        
        System.out.println();
        System.out.println("=== INSTANCEOF DEMONSTRATION ===");
        System.out.println();
        
        // Checking object types
        if (animal1 instanceof Dog) {
            System.out.println("animal1 is a Dog");
            // Downcasting to access Dog-specific methods
            Dog tempDog = (Dog) animal1;
            tempDog.bark();
        }
        
        if (animal2 instanceof Cat) {
            System.out.println("animal2 is a Cat");
            Cat tempCat = (Cat) animal2;
            tempCat.meow();
        }
    }
}