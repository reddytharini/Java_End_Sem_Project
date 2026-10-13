import java.util.*;
import java.lang.*;
import java.io.*;
class DonarDetails {
    void aPos() {
        String[] name = new String[] {"Jai", "Ajay", "Pawan", "kalanyan", "Babu"};
        int[] age = new int[] {45, 50, 28, 15, 90};
        long[] number = new long[] {1122334455, 1677889900, 1231452678, 1233445566, 1234234234};
        String[] email = new String[] {"jai.123@gamil.com", "ajay.406@gamil.com", "pawan.189@gmail.com", "kalanyan.234@gamil.com", "babu.405@gmail.com"};
        int[] date = new int[] {100, 120, 90, 300, 25};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Jai", "101");
        donorIds.put("Ajay", "102");
        donorIds.put("Pawan", "103");
        donorIds.put("Kalyan", "104");
        donorIds.put("Babu", "105");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void aNeg() {
        String[] name = new String[] {"Vijay", "Mashesh", "Hari", "Sai", "Jawal"};
        int[] age = new int[] {45, 50, 25, 44, 60};
        long[] number = new long[] {1234512345, 1345623456, 1231231234, 1342342345, 1234567899};
        String[] email = new String[] {"vijay.123@gamil.com", "mashesh.456@gamil.com", "hari.789@gmail.com", "sai.123@gmail.com", "jawal.789@gmail.com"};
        int[] date = new int[] {100, 120, 400, 165, 200};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Vijay", "201");
        donorIds.put("Mashesh", "202");
        donorIds.put("Hari", "203");
        donorIds.put("Sai", "204");
        donorIds.put("Jawal", "205");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void bPos() {
        String[] name = new String[] {"Sailaja", "Parvathi", "Swetha", "Swapana", "Vinnela"};
        int[] age = new int[] {45, 50, 55, 30, 90};
        long[] number = new long[] {1234567890, 2087654321, 1231021034, 1002030405, 1223344556};
        String[] email = new String[] {"sailaja.123@gamil.com", "parvathi.456@gamil.com", "swetha.345@gmail.com", "swapana.456@gmail.com", "vinnela.678@gmail.com"};
        int[] date = new int[] {100, 120, 111, 123, 100};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Sailaja", "301");
        donorIds.put("Parvathi", "302");
        donorIds.put("Swetha", "303");
        donorIds.put("Swapana", "304");
        donorIds.put("Vinnela", "305");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void bNeg() {
        String[] name = new String[] {"Laxshimi", "Neha", "Harini", "Padmavati", "Santi"};
        int[] age = new int[] {45, 50, 19, 27, 35};
        long[] number = new long[] {1234567890, 2087654321, 1234561234, 1345345345, 1789789789};
        String[] email = new String[] {"laxshimi.123@gamil.com", "neha.456@gamil.com", "harini.7890@gmail.com", "padmavati.4567@gmail.com", "santi.567@gmail.com"};
        int[] date = new int[] {100, 120, 55, 199, 58};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Laxshimi", "401");
        donorIds.put("Naha", "402");
        donorIds.put("Harini", "403");
        donorIds.put("Padmavati", "404");
        donorIds.put("Santi", "405");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void oPos() {
        String[] name = new String[] {"Prasad", "Akili", "Charan", "Bishma", "Sunil"};
        int[] age = new int[] {45, 50, 40, 35, 28, 70};
        long[] number = new long[] {1234567890, 2087654321, 1789789789, 1456745678, 1678678678};
        String[] email = new String[] {"prasad.123@gamil.com", "akili.456@gamil.com", "charan.567@gmail.com", "bishma.234@gmail.com", "sunil.99@gmail.com"};
        int[] date = new int[] {100, 120, 130, 200, 250};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Prasad", "501");
        donorIds.put("AKili", "502");
        donorIds.put("Charan", "503");
        donorIds.put("Bishma", "504");
        donorIds.put("Sunil", "505");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void oNeg() {
        String[] name = new String[] {"kanna", "Vishunu", "Amar", "Abhinav", "Barghav"};
        int[] age = new int[] {45, 50, 49, 18, 25, 58};
        long[] number = new long[] {1234567890, 2087654321, 1987987987, 1654654654, 1321321321};
        String[] email = new String[] {"kanna.123@gamil.com", "vishunu.456@gamil.com", "amar.987@gmail.com", "abhinav.345@gmail.com", "barghav.456@gmail.com"};
        int[] date = new int[] {100, 120, 180, 200, 15};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Kanna", "601");
        donorIds.put("Vishunu", "602");
        donorIds.put("Amar", "603");
        donorIds.put("Abhinav", "604");
        donorIds.put("Barghav", "605");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void abPos() {
        String[] name = new String[] {"Bhannu", "Revati", "Vidhya", "Saraswathi", "Devi"};
        int[] age = new int[] {45, 50, 18, 35, 65};
        long[] number = new long[] {1234567890, 2087654321, 123123123, 1789789789, 1456456456};
        String[] email = new String[] {"bhannu.123@gamil.com", "revati.456@gamil.com", "vidha.234@gmail.com", "saraswathi.678@gmail.com", "devi.234@gmail.com"};
        int[] date = new int[] {100, 120, 95, 200, 190};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Bhannu", "701");
        donorIds.put("Revati", "702");
        donorIds.put("Vidhya", "703");
        donorIds.put("Saraswathi", "704");
        donorIds.put("Devi", "705");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
    void abNeg() {
        String[] name = new String[] {"Vasavi", "Jaya", "Sindhu", "Samhitha", "Indhiravati"};
        int[] age = new int[] {45, 50, 28, 58, 70};
        long[] number = new long[] {1234567890, 2087654321, 1678678678, 1890890890, 1567567567};
        String[] email = new String[] {"vasavi.123@gamil.com", "jaya.456@gamil.com", "sindhu.345@gamil.com", "samhitha.567@gmail.com", "indhiravati.678@gmail.com"};
        int[] date = new int[] {100, 120, 105, 205, 365};
        Map<String, String> donorIds = new HashMap<String, String>();
        donorIds.put("Vasavi", "801");
        donorIds.put("Jaya", "802");
        donorIds.put("Sindhu", "803");
        donorIds.put("Samhitha", "804");
        donorIds.put("Indhiravathi", "805");
        System.out.println("The detailes are");
        for (int i = 0; i < name.length; i++) {
            if ((age[i] >= 21) && (age[i] <=65)) { 
                if (date[i] >= 90) {
                    System.out.println("Person Name: "+name[i]+"\nAge:"+age[i]+"\nPhone Number: "+number[i]+"\nEmail Id: " +email[i]+"\nID: "+donorIds.get(name[i]));
                }
            }
        }
    }
}
class MainCodeExcution extends DonarDetails {
    private int avalibleunits;
    private int position;
    private int count;
    void code(String[] args) {
        System.out.println("Welcome to Apollo Hospital");
        System.out.println("BLOOD BANK");
        System.out.println("The Blood Groups are:");
        System.out.println("1.A+");
        System.out.println("2.A-");
        System.out.println("3.B+");
        System.out.println("4.B-");
        System.out.println("5.O+");
        System.out.println("6.O-");
        System.out.println("7.AB+");
        System.out.println("8.AB-");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of the Blood Group");
        int bloodtype = obj.nextInt();
        int[] blood = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] units = new int[] {0, 0, 6, 5, 8, 20, 75, 0};
        int[] yashodaunits = new int[] {0, 10, 0, 6, 4, 3, 8, 7};
        int[] kimsunits = new int[] {0, 5, 20, 0, 18, 40, 10, 19};
        int[] nimsunits = new int[] {0, 6, 7, 50, 0, 10, 11, 12};
        int[] gumsunits =new int[] {0, 21, 22, 23, 24, 25, 26, 27};
        int[] rainbowunits =new int[] {0, 19, 18, 17, 16, 0, 14, 13};
        this.position = -1;
        for (int i = 0; i < blood.length; i++) {
            if (blood[i] == bloodtype) {
                position = i;
                break;
            }
        }
        this.avalibleunits = 0;
        if (position >= 0) {
            avalibleunits = units[position];
            if (avalibleunits > 0) {
                System.out.println("The Avaliable Units are: "+avalibleunits);
            }
            else {
                this.count = 0;
                if (yashodaunits[position] > 0) {
                    System.out.println("The Avaliable Units in Yashoda Hospital are: "+yashodaunits[position]);
                    System.out.println("Phone Number: 1234567234");
                    System.out.println("Email ID: yashoda.101@gmail.com");
                    count++;
                }
                if (kimsunits[position] > 0) {
                    System.out.println("The Avaliable Units in KIMS Hospital are: "+kimsunits[position]);
                    System.out.println("Phone Number: 1234789789");
                    System.out.println("Email ID: kims.102@gmail.com");
                    count++;
                }
                if (nimsunits[position] > 0) {
                    System.out.println("The Avaliable Units in NIMS Hospital are: "+nimsunits[position]);
                    System.out.println("Phone Number: 1567567890");
                    System.out.println("Email ID: nims.103@gmail.com");
                    count++;
                }
                if (gumsunits[position] > 0) {
                    System.out.println("The Avaliable Units in GUMS Hospital are: "+gumsunits[position]);
                    System.out.println("Phone Number: 1234890567");
                    System.out.println("Email ID: gums.104@gmail.com");
                    count++;
                }
                if (rainbowunits[position] > 0) {
                    System.out.println("The Avaliable Units in RainBow Hospital are: "+rainbowunits[position]);
                    System.out.println("Phone Number: 1567234890");
                    System.out.println("Email ID: rainbow.101@gmail.com");
                    count++;
                }
                if (count == 0) {
                    DonarDetails obj1 = new DonarDetails();
                    switch (bloodtype) {
                        case 1:
                            obj1.aPos();
                            break;
                        case 2:
                            obj1.aNeg();
                            break;
                        case 3:
                            obj1.bPos();
                            break;
                        case 4:
                            obj1.bNeg();
                            break;
                        case 5:
                            obj1.oPos();
                            break;
                        case 6:
                            obj1.oNeg();
                            break;
                        case 7:
                            obj1.abPos();
                            break;
                        case 8:
                            obj1.abNeg();
                            break;
                        default:
                            System.out.println("Invalid Blood Type");
                            break;
                    }
                }
            }
        }
        else {
            System.out.println("NOT AVAILABLE (OR) NOT FOUND");
        }
        obj.close();
    }
}
public class BloodBankInventoryAndDonorMatcher {
    public static void main(String[] args) {
        MainCodeExcution obj = new MainCodeExcution();
        obj.code(args);
    }
}