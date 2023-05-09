
public class App {
    public static void main(String[] args) throws Exception {
       
         // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations bataan = new Bataan();

        Locations aurora = new Aurora();

        Locations bulusanSorsogon = new BulusanSorsogon();

        Locations bicol = new Bicol();

        Locations cebu = new Cebu();

        Locations boracay = new Boracay();

        Me tourist = new Me();

        bataan.accept(tourist);

        aurora.accept(tourist);

        bulusanSorsogon.accept(tourist);

        bicol.accept(tourist);

        cebu.accept(tourist);
        
        boracay.accept(tourist);


        }; 
    }

