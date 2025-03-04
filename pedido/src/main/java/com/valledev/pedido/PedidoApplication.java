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

		Order[] orders = {
				new Order(1034, 150.00, 20.0),
				new Order(2282, 800.00, 10.0),
				new Order(1309, 95.90, 0.0)
		};

		for (Order order : orders) {
			System.out.println("Pedido código: " + order.getCode());
			System.out.println("Valor total: R$ " + String.format("%.2f", orderService.calculateTotal(order)));
			System.out.println();
		}
	}
}
