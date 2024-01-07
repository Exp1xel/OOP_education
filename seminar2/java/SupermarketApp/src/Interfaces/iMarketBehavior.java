package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavior {

    public void acceptToMarket(iActorBehavior actor);
    public void releaseFromMarket(List<Actor> List);
    public void update();

}
