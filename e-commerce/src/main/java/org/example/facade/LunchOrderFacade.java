package org.example.facade;

public class LunchOrderFacade {
    public Lunch lunchOrder() {
        Menu menu = new Menu("Pierogi ruskie");

        Worker worker = new Worker();
        Menu myOrder = worker.order(menu);

        Cooker cooker = new Cooker();
        Lunch myLunch = cooker.order(myOrder);

        Deliver deliver = new Deliver();
        Lunch lunchForSending = deliver.packOrder(myLunch);
        return deliver.sendOrderToClient(lunchForSending);

    }
}
