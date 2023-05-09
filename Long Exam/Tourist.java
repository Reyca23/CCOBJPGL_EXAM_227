interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bicol sorsogon);

    void visit(Bataan bataan);

    void visit(Cebu cebu);
    
    void visit(Boracay boracay);

    void visit(BulusanSorsogon bulusanSorsogon);

    void visit(Aurora aurora);


    default void visit(Locations locations){
        System.out.println("Arrive on the location!<3");

    };

    void checkBudget();
    
}
