package com.kodilla.spring.basic.dependency_injection;

import com.kodilla.spring.basic.dependency_injection.DeliveryService;
import com.kodilla.spring.basic.dependency_injection.NotificationService;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}