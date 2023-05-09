public class Bicol implements Locations {

    int airFare = 70;


    @Override
    public void accept(Tourist tourist){
        tourist.visit(this);
    }

    
}
