package Day4;
abstract class Vaccine{
      private int age;
     private String Nationality;

    public Vaccine(int age, String Nationality){
        this.age = age;
        this.Nationality = Nationality;
    }
    public boolean firstDose(){
        if(age>=18 && Nationality.equals("Indian")){
            System.out.println("First Dose Successful. Pay 250rs");
            return true;
        }else{
            System.out.println("You are not eligible for vaccination");
            return false;
        }
    }
    public void secondDose(boolean isFirst){
        if(isFirst){
            System.out.println("Second Dose successful");
        }
        else {
            System.out.println("You have to complete your first dose first");
        }
    }

     abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine{
    public VaccinationSuccessful(int age, String Nationality){
        super(age, Nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Booster dose administered successfully.");
    }
}
public class Vaccination {
    public static void main(String[] args){
        VaccinationSuccessful vacci = new VaccinationSuccessful(13, "British");
        System.out.println("First Dose:");
        boolean isfirst = vacci.firstDose();
        System.out.println("Second Dose");
        vacci.secondDose(isfirst);
       vacci.boosterDose();

    }
}
