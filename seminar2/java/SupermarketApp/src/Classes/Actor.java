package Classes;

import Interfaces.iActorBehavior;

public abstract class Actor implements iActorBehavior{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;


    public Actor(String name) {
        this.name = name;
    }
    
    public abstract String getName();
    public abstract void setName(String name);
}
