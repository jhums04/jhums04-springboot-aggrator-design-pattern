package com.AggregatorService.AggregatorService.controllers;

import com.AggregatorService.AggregatorService.clientInterfaces.OrderClient;
import com.AggregatorService.AggregatorService.clientInterfaces.UserClient;
import com.AggregatorService.AggregatorService.dto.AggregatorResponse;
import com.AggregatorService.AggregatorService.dto.OrderDTO;
import com.AggregatorService.AggregatorService.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aggregate")
public class AggregatorController {

    private OrderClient orderClient;
    private UserClient userClient;

    @Autowired
    public AggregatorController(OrderClient orderClient, UserClient userClient) {
        this.orderClient = orderClient;
        this.userClient = userClient;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<AggregatorResponse> getUserDetails(@PathVariable String userId) {
        UserDTO user = userClient.getUser(userId);
        List<OrderDTO> orders = orderClient.getOrders(userId);
        AggregatorResponse response = new AggregatorResponse(user, orders);
        return ResponseEntity.ok(response);
    }
}
