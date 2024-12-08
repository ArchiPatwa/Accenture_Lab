package Day4;
class HillStation{
   public void location(){
        System.out.println("this is the location of Hillstation");
    }
    public void famousFor(){
        System.out.println("This HillStation is famous for.....");
    }
}
class Manali extends HillStation{
    @Override
    public void location() {
        System.out.println("Manali is located in HimachalPradesh");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for momos");
    }
}
class Mussoorie extends HillStation{
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for Mussoorie Lake");
    }
}
class Gulmarg extends HillStation{
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for Skiing and Winter Sports");
    }
}
public class HillStationMain {
 public static void main(String[] args){
     HillStation hill = new HillStation();
     hill.location();
     hill.famousFor();

     HillStation manali = new Manali();
     HillStation mussoorie = new Mussoorie();
     HillStation gulmarg = new Gulmarg();

     manali.location();
     manali.famousFor();

     mussoorie.location();
     mussoorie.famousFor();

     gulmarg.location();
     gulmarg.famousFor();
 }
}
