package Classes;

import java.util.Random;

import Interfaces.iReturnOrder;
/**
 * Класс, описывающий обычного покупателя,
 * имплементирующий интерфейс возврата товара
 */
public class OrdinaryClient extends Actor implements iReturnOrder{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
    
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
        
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
        
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }
    public Actor getActor() {
        return this;
    }
    /**
     * Метод, описывающий возращение товара
     * в виде логического значение на основе случайного числа (0 || 1)
     */
    public boolean returnOrder() {
        Random rand = new Random();
        return (rand.nextInt(2) == 1) ? true : false;
    }
}
