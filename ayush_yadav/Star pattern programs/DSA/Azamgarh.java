import java.util.Arrays;

public class Azamgarh{
    void Katohi () {
        String pardhan = " Ram" ;
        String[]peoples = {"ram", "shayam", "vivek", "ramakant", "vishundev"};
       int population = peoples.length;
       
        System.out.println("Pardhan of Katohi" + pardhan);
        System.out.println("Population of Katohi " + population); 
        System.out.println("Peoples of katohi: "+Arrays.toString(peoples));
    }

    void Etori () {
        String pardhan = " Shayam " ;
        String[]peoples = {"ram", "shayam", "vivek", "ramakant", "vishundev"};
        int population = peoples.length;
        System.out.println("Pardhan of Etori" + pardhan);
        System.out.println("Population of Etori " + population);
        System.out.println("Peoples of katohi: "+Arrays.toString(peoples));

    }


        public static void main (String[]args){
            Azamgarh obj = new Azamgarh ();
            obj.Katohi ();
            obj.Etori ();
        }

    }
