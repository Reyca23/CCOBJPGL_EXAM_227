public class Bataan implements Locations {

    int airFare = 50;


    @Override
    public void accept(Tourist tourist){
        tourist.visit(this);
    }

    
}
