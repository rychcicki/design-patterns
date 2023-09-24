package org.example.facade;

import java.util.concurrent.TimeUnit;

class Deliver {
    Lunch packOrder(Lunch lunch) {
        System.out.println("Packing the oder. Please wait...");
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException("Something wrong with TimeUnit sleep" + e);
        }
        return lunch;
    }

    Lunch sendOrderToClient(Lunch lunch) {
        System.out.println("Your order was sending. Thank you for your patience.");
        return lunch;
    }
}
