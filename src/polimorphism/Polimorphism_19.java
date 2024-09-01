package polimorphism;
class bank{
    float getRateofInterest(){
        return 0;
    }
}
class citybank extends bank{
    @Override
    float getRateofInterest() {
        return 10;
    }
}
class arafah extends bank{
    @Override
    float getRateofInterest() {
        return 12;
    }
}
public class Polimorphism_19 {
    public static void main(String[] args) {
        bank b;
        b=new citybank();
        System.out.println("City bank rate="+b.getRateofInterest());b=new citybank();
        b=new arafah();
        System.out.println("Arafah bank rate="+b.getRateofInterest());

    }

}
