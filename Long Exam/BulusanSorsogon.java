public class BulusanSorsogon implements Locations {

    int airFare = 10;


    @Override
    public void accept(Tourist tourist){
        tourist.visit(this);
    }

    
}
