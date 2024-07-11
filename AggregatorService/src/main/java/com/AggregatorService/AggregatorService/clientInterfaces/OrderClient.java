package com.AggregatorService.AggregatorService.clientInterfaces;

import com.AggregatorService.AggregatorService.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service", url = "http://localhost:8081/api/order")
public interface OrderClient {
    @GetMapping("/{userId}")
    List<OrderDTO> getOrders(@PathVariable String userId);
}
