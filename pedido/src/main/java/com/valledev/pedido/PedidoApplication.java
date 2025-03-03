package com.valledev.pedido;

import com.valledev.pedido.entities.Order;
import com.valledev.pedido.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 00.0);

		System.out.println("Pedido código: " + order1.getCode() + "\nValor total: R$ "
				+ String.format("%.2f", orderService.calculateTotal(order1)) + "\n");

		System.out.println("Pedido código: " + order2.getCode() + "\nValor total: R$ "
				+ String.format("%.2f", orderService.calculateTotal(order2))+ "\n");

		System.out.println("Pedido código: " + order3.getCode() + "\nValor total: R$ "
				+ String.format("%.2f", orderService.calculateTotal(order3))+ "\n");
	}
}
