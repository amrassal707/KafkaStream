package com.SpringCloud.KafkaStream.Domain;

import org.springframework.stereotype.Component;

@Component
public class Order {

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setPrice(String price) {
        this.price = price;
    }



    private String order_id;
    private String price;

}
