package org.example.facade;

import java.util.concurrent.TimeUnit;

class Cooker implements Order {
    @Override
    public Lunch order(Menu menu) {
        Lunch myLunch = prepareOrder(menu);
        return sendOrderToDelivery(myLunch);
    }

    Lunch prepareOrder(Menu menu) {
        System.out.println("Your order is on progress. Please wait...");
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException("Something wrong with TimeUnit sleep: " + e);
        }
        Lunch lunch = new Lunch();
        lunch.setMenu(menu);
        return lunch;
    }

    Lunch sendOrderToDelivery(Lunch lunch) {
        System.out.println("Your order is finished.");
        return lunch;
    }
}
