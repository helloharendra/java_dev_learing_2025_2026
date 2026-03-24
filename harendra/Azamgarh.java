import java.util.*;

public class Azamgarh {
    
    // Inner class to represent a Person
    static class Person {
        String name;
        int age;
        String gender; // "Male", "Female", "Other"
        boolean isVoterEligible;
        
        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.isVoterEligible = age >= 18;
        }
        
        @Override
        public String toString() {
            return String.format("  - %s (Age: %d, Gender: %s, Voter: %s)", 
                name, age, gender, isVoterEligible ? "Yes" : "No");
        }
    }
    
    // Inner class to represent a Village
    static class Village {
        String name;
        String pardhan;
        List<Person> people;
        Map<String, Integer> statistics;
        
        public Village(String name, String pardhan) {
            this.name = name;
            this.pardhan = pardhan;
            this.people = new ArrayList<>();
            this.statistics = new HashMap<>();
        }
        
        public void addPerson(String name, int age, String gender) {
            people.add(new Person(name, age, gender));
        }
        
        public void calculateStatistics() {
            int totalPopulation = people.size();
            int males = 0, females = 0, others = 0;
            int children = 0, adults = 0, seniorCitizens = 0;
            int eligibleVoters = 0;
            int maleVoters = 0, femaleVoters = 0;
            
            for (Person p : people) {
                // Gender count
                switch (p.gender.toLowerCase()) {
                    case "male":
                        males++;
                        if (p.isVoterEligible) maleVoters++;
                        break;
                    case "female":
                        females++;
                        if (p.isVoterEligible) femaleVoters++;
                        break;
                    default:
                        others++;
                }
                
                // Age group count
                if (p.age < 18) {
                    children++;
                } else if (p.age >= 18 && p.age < 60) {
                    adults++;
                } else {
                    seniorCitizens++;
                }
                
                // Voter count
                if (p.isVoterEligible) {
                    eligibleVoters++;
                }
            }
            
            // Store statistics
            statistics.put("Total Population", totalPopulation);
            statistics.put("Males", males);
            statistics.put("Females", females);
            statistics.put("Others", others);
            statistics.put("Children (Below 18)", children);
            statistics.put("Adults (18-59)", adults);
            statistics.put("Senior Citizens (60+)", seniorCitizens);
            statistics.put("Eligible Voters", eligibleVoters);
            statistics.put("Male Voters", maleVoters);
            statistics.put("Female Voters", femaleVoters);
        }
        
        public void displayVillageDetails() {
            System.out.println("\n=================================");
            System.out.println("VILLAGE: " + name.toUpperCase());
            System.out.println("=================================");
            System.out.println("Pardhan/Sarpanch: " + pardhan);
            System.out.println("Total Population: " + people.size());
            
            // Display all people
            System.out.println("\n--- List of All People ---");
            for (Person p : people) {
                System.out.println(p);
            }
            
            // Display statistics
            System.out.println("\n--- Village Statistics ---");
            for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
                System.out.printf("%-25s: %d%n", entry.getKey(), entry.getValue());
            }
            
            // Display eligible voters
            System.out.println("\n--- Eligible Voters (Age 18+) ---");
            for (Person p : people) {
                if (p.isVoterEligible) {
                    System.out.printf("  %s (%d, %s)%n", p.name, p.age, p.gender);
                }
            }
        }
    }
    
    // Village instances
    Village katohi;
    Village itauri;
    Village bardah;
    Village sarayMiyan;
    
    // District information
    String districtName;
    Map<String, Village> villages;
    
    public Azamgarh() {
        this.districtName = "Azamgarh";
        this.villages = new HashMap<>();
        initializeVillages();
    }
    
    private void initializeVillages() {
        // Initialize Katohi village
        katohi = new Village("Katohi", "Ram");
        katohi.addPerson("Vivek", 25, "Male");
        katohi.addPerson("Ayush", 17, "Male");
        katohi.addPerson("Vishnu", 30, "Male");
        katohi.addPerson("Gore", 45, "Male");
        katohi.addPerson("Kariya", 8, "Male");
        katohi.addPerson("Ramakant", 65, "Male");
        katohi.addPerson("Sita", 28, "Female");
        katohi.addPerson("Gita", 16, "Female");
        katohi.addPerson("Radha", 55, "Female");
        katohi.addPerson("Mohan", 12, "Male");
        katohi.calculateStatistics();
        villages.put("katohi", katohi);
        
        // Initialize Itauri village
        itauri = new Village("Itauri", "Shyam");
        itauri.addPerson("Shyam", 40, "Male");
        itauri.addPerson("Ram Kumar", 35, "Male");
        itauri.addPerson("Priya", 22, "Female");
        itauri.addPerson("Riya", 15, "Female");
        itauri.addPerson("Amit", 28, "Male");
        itauri.addPerson("Neha", 32, "Female");
        itauri.addPerson("Rajesh", 58, "Male");
        itauri.addPerson("Kavita", 62, "Female");
        itauri.addPerson("Anjali", 9, "Female");
        itauri.addPerson("Deepak", 19, "Male");
        itauri.calculateStatistics();
        villages.put("itauri", itauri);
        
        // Initialize Bardah village
        bardah = new Village("Bardah", "Ramesh");
        bardah.addPerson("Ramesh", 50, "Male");
        bardah.addPerson("Sunita", 45, "Female");
        bardah.addPerson("Rahul", 23, "Male");
        bardah.addPerson("Pooja", 20, "Female");
        bardah.addPerson("Sanjay", 55, "Male");
        bardah.addPerson("Manju", 48, "Female");
        bardah.addPerson("Arjun", 17, "Male");
        bardah.addPerson("Kiran", 14, "Female");
        bardah.addPerson("Manoj", 67, "Male");
        bardah.addPerson("Anita", 70, "Female");
        bardah.calculateStatistics();
        villages.put("bardah", bardah);
        
        // Initialize Saray Miyan village.  
        sarayMiyan = new Village("Saray Miyan", "Jameel");
        sarayMiyan.addPerson("Jameel", 60, "Male");
        sarayMiyan.addPerson("Fatima", 55, "Female");
        sarayMiyan.addPerson("Ali", 28, "Male");
        sarayMiyan.addPerson("Ayesha", 24, "Female");
        sarayMiyan.addPerson("Hasan", 32, "Male");
        sarayMiyan.addPerson("Zainab", 29, "Female");
        sarayMiyan.addPerson("Omar", 16, "Male");
        sarayMiyan.addPerson("Sara", 12, "Female");
        sarayMiyan.addPerson("Yusuf", 70, "Male");
        sarayMiyan.addPerson("Amina", 65, "Female");
        sarayMiyan.calculateStatistics();
        villages.put("saraymiyan", sarayMiyan);
    }
    
    // Method to display all villages
    public void displayAllVillages() {
        System.out.println("\n==========================================");
        System.out.println("DISTRICT: " + districtName.toUpperCase());
        System.out.println("==========================================");
        System.out.println("Total Villages: " + villages.size());
        
        for (Village village : villages.values()) {
            village.displayVillageDetails();
        }
    }
    
    // Method to display a specific village
    public void displayVillage(String villageName) {
        Village village = villages.get(villageName.toLowerCase());
        if (village != null) {
            village.displayVillageDetails();
        } else {
            System.out.println("Village '" + villageName + "' not found in " + districtName + " district.");
        }
    }
    
    // Method to get district summary
    public void displayDistrictSummary() {
        int totalPopulation = 0;
        int totalVoters = 0;
        int totalMales = 0;
        int totalFemales = 0;
        int totalChildren = 0;
        
        for (Village village : villages.values()) {
            totalPopulation += village.statistics.get("Total Population");
            totalVoters += village.statistics.get("Eligible Voters");
            totalMales += village.statistics.get("Males");
            totalFemales += village.statistics.get("Females");
            totalChildren += village.statistics.get("Children (Below 18)");
        }
        
        System.out.println("\n==========================================");
        System.out.println("DISTRICT SUMMARY - " + districtName.toUpperCase());
        System.out.println("==========================================");
        System.out.println("Total Villages: " + villages.size());
        System.out.println("Total Population: " + totalPopulation);
        System.out.println("Total Eligible Voters: " + totalVoters);
        System.out.println("Total Males: " + totalMales);
        System.out.println("Total Females: " + totalFemales);
        System.out.println("Total Children (Below 18): " + totalChildren);
        System.out.println("Voter Turnout Potential: " + 
            String.format("%.2f%%", (totalVoters * 100.0 / totalPopulation)));
        System.out.println("==========================================");
    }
    
    // Method to find eligible voters by gender
    public void findEligibleVotersByGender(String gender) {
        System.out.println("\n=== ELIGIBLE " + gender.toUpperCase() + " VOTERS IN " + districtName.toUpperCase() + " ===");
        boolean found = false;
        
        for (Village village : villages.values()) {
            List<Person> eligibleInVillage = new ArrayList<>();
            for (Person p : village.people) {
                if (p.isVoterEligible && p.gender.equalsIgnoreCase(gender)) {
                    eligibleInVillage.add(p);
                }
            }
            
            if (!eligibleInVillage.isEmpty()) {
                System.out.println("\nVillage: " + village.name);
                for (Person p : eligibleInVillage) {
                    System.out.printf("  %s (%d years)%n", p.name, p.age);
                }
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No eligible " + gender + " voters found.");
        }
    }
    
    public static void main(String[] args) {
        Azamgarh district = new Azamgarh();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=================================");
            System.out.println("AZAMGARH DISTRICT INFORMATION SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Display All Villages");
            System.out.println("2. Display Specific Village");
            System.out.println("3. Display District Summary");
            System.out.println("4. Find Eligible Male Voters");
            System.out.println("5. Find Eligible Female Voters");
            System.out.println("6. Add Person to Village");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    district.displayAllVillages();
                    break;
                    
                case 2:
                    System.out.print("Enter village name (Katohi, Itauri, Bardah, SarayMiyan): ");
                    String villageName = scanner.nextLine();
                    district.displayVillage(villageName);
                    break;
                    
                case 3:
                    district.displayDistrictSummary();
                    break;
                    
                case 4:
                    district.findEligibleVotersByGender("Male");
                    break;
                    
                case 5:
                    district.findEligibleVotersByGender("Female");
                    break;
                    
                case 6:
                    System.out.print("Enter village name to add person: ");
                    String addVillage = scanner.nextLine();
                    Village village = district.villages.get(addVillage.toLowerCase());
                    
                    if (village != null) {
                        System.out.print("Enter person name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter gender (Male/Female/Other): ");
                        String gender = scanner.nextLine();
                        
                        village.addPerson(name, age, gender);
                        village.calculateStatistics();
                        System.out.println("Person added successfully!");
                    } else {
                        System.out.println("Village not found!");
                    }
                    break;
                    
                case 7:
                    System.out.println("Thank you for using the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }
    }
}