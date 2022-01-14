package com.wangfei.corejava.chapter2;

import java.util.ArrayList;

public class Invoice {

    public static class Item {
        private final String description;
        private final int quantity;
        private final double unitPrice;

        public double price() {
            return quantity * unitPrice;
        }

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }

    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem(new Invoice.Item("ceshi", 1, 1.2d));
        invoice.items.forEach(System.out::println);
    }
}
