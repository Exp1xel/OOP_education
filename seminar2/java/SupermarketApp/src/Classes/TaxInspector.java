package Classes;

import Interfaces.iActorBehavior;

public class TaxInspector implements iActorBehavior{
    private String name;

    public String getName() {
        return name;
    }

    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector(){
        this.name = "Налоговый инспектор";
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        return new OrdinaryClient("Тайный покупатель", 4);
    }

    @Override
    public boolean returnOrder() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
