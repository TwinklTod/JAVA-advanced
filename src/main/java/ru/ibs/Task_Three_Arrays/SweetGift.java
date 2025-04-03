package ru.ibs.Task_Three_Arrays;
import java.util.*;

abstract class Sweet {
    String name;
    double weight;
    double price;
    String uniqueProperty;

    public Sweet(String name, double weight, double price, String uniqueProperty) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueProperty = uniqueProperty;
    }

    @Override
    public String toString() {
        return name + " (Вес: " + weight + "г, Цена: " + price + "р, " + uniqueProperty + ")";
    }
}

class Candy extends Sweet {
    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price, "Вкус: " + flavor);
    }
}

class Jellybean extends Sweet {
    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price, "Цвет: " + color);
    }
}

class ChocolateBar extends Sweet {
    public ChocolateBar(String name, double weight, double price, String cocoaContent) {
        super(name, weight, price, "Какао: " + cocoaContent);
    }
}

class Lollipop extends Sweet {
    public Lollipop(String name, double weight, double price, String stickLength) {
        super(name, weight, price, "Длина палочки: " + stickLength);
    }
}

public class SweetGift {
    private final List<Sweet> gift;

    public SweetGift() {
        gift = new ArrayList<>();
        gift.add(new Candy("Шоколадка", 200, 150, "Шоколад"));
        gift.add(new Jellybean("Мармелад", 100, 80, "Красный"));
        gift.add(new Candy("Карамель", 50, 40, "Фруктовый"));
        gift.add(new ChocolateBar("Темный шоколад", 150, 200, "75%"));
        gift.add(new Lollipop("Леденец на палочке", 30, 50, "10 см"));
    }

    public void displayGift() {
        double totalWeight = gift.stream().mapToDouble(s -> s.weight).sum();
        double totalPrice = gift.stream().mapToDouble(s -> s.price).sum();

        System.out.println("\nСостав подарка:");
        gift.forEach(System.out::println);
        System.out.println("Общий вес подарка: " + totalWeight + " г");
        System.out.println("Общая стоимость подарка: " + totalPrice + " р");
    }
}
