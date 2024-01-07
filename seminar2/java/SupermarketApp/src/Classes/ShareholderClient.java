package Classes;

import java.util.Random;

import Interfaces.iReturnOrder;

/**
 * Класс, описывающий акционного покупателя,
 * имплементирующий интерфейс возврата товара
 */
public class ShareholderClient extends Actor implements iReturnOrder{
    private String share;
    private int idClient;
    public static int shareholderCount;


    /**
     * Конструктор класса
     * @param name
     * @param share
     * @param idClient
     */
    public ShareholderClient(String name, String share, int idClient) {
        super(name);
        this.share = share;
        this.idClient = idClient;
        shareholderCount++;
    }

    /**
     * Методы класса
     */
    public String getShare() {
        return share;
    }
    public void setShare(String share) {
        this.share = share;
    }

    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public boolean returnOrder() {
        Random rand = new Random();
        return (rand.nextInt(2) == 1) ? true : false;
    }
}
