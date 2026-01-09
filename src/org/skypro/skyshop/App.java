package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Product phone = new Product("Телефон", 50_000);
        Product computer = new Product("Компьютер", 150_000);
        Product car = new Product("Машина", 500_000);
        Product tv = new Product("Телевизор", 70_000);
        Product book = new Product("Книга", 1_000);
        Product extra = new Product("Лишний товар", 999_999); // Этот не должен добавиться

        ProductBasket basket = new ProductBasket();

        System.out.println("--- Добавляем 5 продуктов ---");
        basket.addProduct(phone);
        basket.addProduct(computer);
        basket.addProduct(car);
        basket.addProduct(tv);
        basket.addProduct(book);

        System.out.println("--- Пробуем добавить 6-й продукт ---");
        basket.addProduct(extra);

        System.out.println("--- Печать корзины ---");
        basket.printBasket();

        System.out.println("--- Общая стоимость корзины ---");
        System.out.println("Итоговая сумма: " + basket.getTotalCost());

        System.out.println("--- Поиск существующего товара (Телефон) ---");
        System.out.println("Найден? " + basket.checkProductByName("Телефон")); // Ожидаем true

        System.out.println("--- Поиск несуществующего товара (Утюг) ---");
        System.out.println("Найден? " + basket.checkProductByName("Утюг")); // Ожидаем false

        System.out.println("--- Очистка корзины ---");
        basket.clearBasket();
        System.out.println("Корзина очищена.");

        System.out.println("--- Проверка пустой корзины ---");
        basket.printBasket();
        System.out.println("Стоимость пустой корзины: " + basket.getTotalCost());

        System.out.println("--- Поиск в пустой корзине ---");
        System.out.println("Найден? " + basket.checkProductByName("Телефон")); // Ожидаем false
    }
}