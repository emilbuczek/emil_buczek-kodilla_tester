package com.kodilla.spring.basic.dependency_injection;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DHLDeliveryService();
        NotificationService notificationService = new EmailNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Wild Street 50, New York", 18.2);
    }
}