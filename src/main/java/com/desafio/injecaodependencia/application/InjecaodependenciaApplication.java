package com.desafio.injecaodependencia.application;

import com.desafio.injecaodependencia.entities.Order;
import com.desafio.injecaodependencia.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.desafio"})
public class InjecaodependenciaApplication implements CommandLineRunner {

    OrderService orderService;

    public InjecaodependenciaApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InjecaodependenciaApplication.class, args);
	}

    public void run(String... args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Integer code = sc.nextInt();
        Double basic = sc.nextDouble();
        Double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        double total = orderService.total(order);

        System.out.println("Order code: " + order.getCode());
        System.out.printf("Total value: $%.2f%n", total);

        sc.close();

    }
}
