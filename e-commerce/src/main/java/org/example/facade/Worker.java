package org.example.facade;

class Worker implements Order {
    @Override
    public Menu order(Menu menu) {
        Menu myMenu = takeOrder(menu);
        return sendOrderToCook(myMenu);
    }

    Menu takeOrder(Menu menu) {
        System.out.println("Thank you for your order.");
        return menu;
    }

    Menu sendOrderToCook(Menu menu) {
        System.out.println("Sending order to realization.");
        return menu;
    }
}
