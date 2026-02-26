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

                System.out.println("\n--- List of All People---");
            for (Person p : people) {
                System.out.println(p);
            }
                

              System.out.println("\n--- Villages Statistics---");
              for (Map.Entry<String, Integer>entry : statistics.entrySet()) {     
                System.out.printf("%-25: %d%n", entry.getKey(), entry.getValue());           
              }
              System.out.println("\n--- Eligible Voters(Age 18+)---");
               for (Person p : people) {
                if (p.isVoterEligible)
              System.out.printf(" %s (%d , %s)%n", p.name, p.age , p.gender );
            }

        }
    }


    Village Katohi ;          
    Village itauri;          
    Village bardah;          
    Village sarayMiyan;     

    String districtName;
    Map<String, Village> village;

    public Azamgarh(){
        this.districtName = "Azamgarh";
        this.villages = new HasMap<> ();
        initializeVillages();
    }     

    private void initializeVillages() {
     Katohi = new Village (name : "Katohi", pardhan : "Ram") ;  
     katohi.addPerson(name : "Ayush", age : 15, gender : "male");
     katohi.addPerson(name : "Vivek", age : 25, gender : "male");
     katohi.addPerson(name : "Anand", age : 20, gender : "male");
     katohi.addPerson(name : "Vishundev", age : 23, gender : "male");
     katohi.addPerson(name : "gita", age : 25, gender : "female");
     katohi.addPerson(name : "radha", age : 25, gender : "female");
    katohi.addPerson(name : "xyz", age : 25, gender : "female");
    katohi.addPerson(name : "abc", age : 25, gender : "female");
    katohi.calculatesstatistics();
    villages.put("katohi" , katohi);

    itauri = new itauri (name:"itauri", pardan:"Shayam");
    itauri.addPerson (name: "Shayam", age : 24 , gender ,"male");
    itauri.addPerson (name: "ram", age : 29, gender ,"male");
    itauri.addPerson (name: "mohan", age : 288 , gender ,"male");
    itauri.addPerson (name: "ramakant", age : 25 , gender ,"male");
    itauri.addPerson (name: "Riya", age : 36 , gender ,"female");
    itauri.addPerson (name: "sanjay", age : 14 , gender ,"male");
    itauri.addPerson (name: "Manju", age : 35 , gender ,"female");
    itauri.addPerson (name: "Kiran", age : 55 , gender ,"female");
    itauri.addPerson (name: "aman", age : 24 , gender ,"male");
    itauri.calculatesstatistics();
    village.put("itauri" , itauri);

    bardah = new VILLAGE (name : "bardah" , pardhan : "chunu");
    bardah.addPerson (name : "kavita" , age : 15 gender : "female");
    bardah.addPerson (name : "Mohan" , age : 35 gender : "female");
    bardah.addPerson (name : "Sohan" , age : 45 gender : "female"); 
    bardah.addPerson (name : "Sunil" , age : 85 gender : "female");
    bardah.addPerson (name : "Maya" , age : 35 gender : "female");
    bardah.addPerson (name : "komal" , age : 55 gender : "female");
    bardah.addPerson (name : "Sumit" , age : 15 gender : "female");
    bardah.addPerson (name : "Sahil" , age : 75 gender : "female");
    bardah.calculatesstatistics();
    village.put("bardah" , bardah);

    sarayMiyan = new VILLAGE (name : "saraMiyan" , pardan : "ManMohan");
    saraMiyan.addPerson (name : "Manjolika" , age :29   gender : "female");
    saraMiyan.addPerson (name : "mohit" , age : 34  gender : "male");
    saraMiyan.addPerson (name : "khuldip" , age :28   gender : "male");
    saraMiyan.addPerson (name : "Sara" , age :24   gender : "female");
    saraMiyan.addPerson (name : "Yusuf" , age :12  gender : "");
    saraMiyan.addPerson (name : "Amit" , age :   gender :10 "male")
    saraMiyan.addPerson (name : "Sohan" , age :   gender :28 "female");
    saraMiyan.addPerson (name : "Tilak" , age :   gender :33 "male");
    saraMiyan.addPerson (name : "karan" , age :   gender : 39"male");
    saraMiyan.addPerson (name : "Alok" , age :   gender :74 "female");
    saraMiyan.calculatesstatistics();
    village.put("sayaMiyan" , saraMiyan)
 }


 public void displayVillageDetails() {
                System.out.println("\n=================================");
                System.out.println("DISTRICT :" + districtName.toUpperCase();)
                System.out.println("\=================================");
                System.out.println ("Total Population: " + peoples.size());

                for (Village village : villages.values()) {
                    Villages.displayVillageDetails();
                }
            }
      public void displayVillages(String villageName) {
        village village = villages.get(VillageName.toLowerCase());
        if(village ! = null) {
            village.displayVillageDetails ();
        }else{
            System.out.println("Villages" + villageName + "not found in" + )
        }
      }      
 }