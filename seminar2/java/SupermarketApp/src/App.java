/**
 * Волков Р.А.
 * 07.01.2024
 * 
 * Не уверен, что я правильно понял задание 1 и 2
 * То есть, например, надо ли связывать возврат товара с его получением?
 * Надо ли учитывать, что акции могут быть разные и в зависимости от этото считать кол-во участников?
 * 
 * Комментарии писал только для тех методов и интерфейсов, которые добавил в ходе домашней работы
 * Не уверен, надо ли было писать для семинарских
 */

import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.ShareholderClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("Boris", 1);
        Actor client2 = new OrdinaryClient("Olga", 2);
        Actor client3 = new SpecialClient("Kirkorov", 1);
        iActorBehavior client4 = new TaxInspector();

        /**
         * Объявление акционных клиентов
         */
        Actor client5 = new ShareholderClient("Nikolai", "Тройная радость!", 1);
        Actor client6 = new ShareholderClient("Dmitrii", "Тройная радость!", 2);
        Actor client7 = new ShareholderClient("Roman", "Тройная радость!", 3);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();
        /**
         * Вывод статического свойства класса, описывающего акционных клиентов
         * И результат (логического типа) работы метода возврата товара у разных типов клиентов
         */
        System.out.println(ShareholderClient.shareholderCount);
        System.out.println(client1.returnOrder());
        System.out.println(client3.returnOrder());
        System.out.println(client6.returnOrder());

    }
}
