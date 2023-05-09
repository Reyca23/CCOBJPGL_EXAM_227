public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");

    }
    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }
        //Define your visit

    public void visit(Bicol Sorsogon){
        if(budget < Sorsogon.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Bicol Sorsogon!<3");
            budget = budget - Sorsogon.airFare;
        }
        checkBudget();
    }

    public void visit(Bataan bataan){
        if(budget < bataan.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Bataan!<3");
            budget = budget - bataan.airFare;
        }
        checkBudget();
    }

    public void visit(Cebu cebu){
        if(budget < cebu.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Cebu!<3");
            budget = budget - cebu.airFare;
        }
        checkBudget();
    }

    public void visit(Aurora aurora){
        if(budget < aurora.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Aurora!<3");
            budget = budget - aurora.airFare;
        }
        checkBudget();
    }

    public void visit(BulusanSorsogon bulusanSorsogon){
        if(budget < bulusanSorsogon.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Bulusan Sorsogon!<3");
            budget = budget - bulusanSorsogon.airFare;
        }
        checkBudget();
    }
    
    public void visit(Boracay boracay){
        if(budget < boracay.airFare){
            System.out.println("My budget ran out!");
        }else {
            System.out.println("I want to go to Sorsogon!<3");
            budget = budget - boracay.airFare;
        }
        checkBudget();
    }
}

