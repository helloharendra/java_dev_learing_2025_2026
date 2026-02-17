import java.util.Arrays;

public class Azamgarh{


    static class  Person {
        String name;
        String age;
        String gender;
        boolean isVoterEligible;

       public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isVoterEligible = age >= 18;
       }
       @override
       public String toString(){
        return String.format(" -%s (Age: %d, Gender: %s, Voter: %s)";
        name, age, gender, is VoterEligible ? "Yes" : "No");
       }
    }
    static class Villages{
        String name;
        String pardhan;
        List<Person> people;
        Map<String, Integer> statistics;
        public Villages (String name, String pardhan){
        this.name = name;
        this.pardhan = pardhan;
        this.people = new  ArrayList<>();
        this.statistics = new HasMap<>();
        }
        public void addPerson (String name, int age, String gender){
            people.add(new Person(name, age, gender));
        }
        public void calculatesstatistics () {
            int totalPopulation = people.size();
            int males = 0; females = 0; others = 0;
            int childern = 0; adults = 0; seniorcitizens = 0;
            int VoterEligible = 0;
            int maleVoters = 0, femalesVoters = 0;

            for (Person p : people){
                switch (p.gender.toLowerCase()) {
                    case "male":
                        males++;
                        if(p.isVoterEligible) maleVoters++;
                        break;
                        case "female":
                            females++;
                            if (p.isVoterEligible) femalesVoters++;
                            break;
                            default;
                            others++;
                }
                if (p.age < 18) {
                    childern ++;
                }else if (p.age >= 18 && p.age < 60) {
                    adults++;
                }else { 
                    seniorcitizens++;
                }

                if(p.isVoterEligible){
                    eligibleVoters++;
                }
                }
                statistics.put("Total Population",totalPopulation);
                statistics.put("Males",males);
                statistics.put("Females",females);
                statistics.put("Others"others);
                statistics.put("Children (Below 18)",childern);
                statistics.put("Adults (18-59)",adults);
                statistics.put("Senior Citizens (60+)",seniorcitizens);
                statistics.put("Eligible Voters",eligibleVoters);
                statistics.put("Male Voters",maleVoters);
                statistics.put("Female Voters",femalesVoters);
            }
            public void displayVillageDetails() {
                System.out.println("\n=================================");
                System.out.println("VILLAGE: + name.toUpperCase()");
                System.out.println("\=================================");
                System.out.println ("Pardhan/Sarpanch: " + pardhan); 
                System.out.println ("Total Population: " + peoples.size());
            }
        }
    }

