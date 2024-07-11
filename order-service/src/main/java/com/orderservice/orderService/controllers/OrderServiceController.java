package com.orderservice.orderService.controllers;

import com.orderservice.orderService.dto.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderServiceController {
    @GetMapping("/{userId}")
    public ResponseEntity<List<OrderDTO>> getOrders(@PathVariable String userId) {
        List<OrderDTO> orders = Arrays.asList(
                new OrderDTO("1", userId, "Laptop"),
                new OrderDTO("2", userId, "Smartphone")
        );
        return ResponseEntity.ok(orders);
    }
}
