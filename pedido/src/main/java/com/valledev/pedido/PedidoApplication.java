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
		Order order = new Order(777, 95.90, 00.0);

		System.out.println("Pedido código: " + order.getCode() + "\nValor total: R$ "
				+ String.format("%.2f", orderService.calculateTotal(order)));
	}
}
