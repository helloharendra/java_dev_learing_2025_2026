import java.util.Arrays;

public class Azamgarh {
    void Katohi() {
        String pardhan = " Ram";
        String[] peoples = { "vivek", "ayush", "vishnu", "gore", "kariya","ramakant" };
        int population = peoples.length;
        System.out.println("Pardhan of Katohi" + pardhan);
        System.out.println("Population of Katohi " + population);
        System.out.println("Peoples of katohi: "+Arrays.toString(peoples));
    }
    void Itauri() {
        String pardhan = " Shayam ";
        int population = 500;
        System.out.println("Pardhan of Etori" + pardhan);
        System.out.println("Population of Etori " + population);

    }

    public static void main(String[] args) {
        Azamgarh obj = new Azamgarh();
        obj.Katohi();
     
    }

}