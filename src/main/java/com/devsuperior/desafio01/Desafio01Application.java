package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.NumberFormat;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order orderOne = new Order(1034, 150.00, 20.0);
        Order orderTwo = new Order(2282, 800.00, 10.0);
        Order orderThree = new Order(1309, 95.90, 0.0);

        System.out.println("\n");
        System.out.println("+--- EXEMPLO 1 ---+");
        System.out.println("Pedido código: " + orderOne.getCode());
        System.out.println("Valor total: " + NumberFormat.getCurrencyInstance().format(orderService.total(orderOne)));
        System.out.println("\n");

        System.out.println("+--- EXEMPLO 2 ---+");
        System.out.println("Pedido código: " + orderTwo.getCode());
        System.out.println("Valor total: " + NumberFormat.getCurrencyInstance().format(orderService.total(orderTwo)));
        System.out.println("\n");

        System.out.println("+--- EXEMPLO 3 ---+");
        System.out.println("Pedido código: " + orderThree.getCode());
        System.out.println("Valor total: " + NumberFormat.getCurrencyInstance().format(orderService.total(orderThree)));
        System.out.println("\n");

    }
}
