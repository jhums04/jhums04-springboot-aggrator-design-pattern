package com.AggregatorService.AggregatorService.clientInterfaces;

import com.AggregatorService.AggregatorService.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8082/api/user")
public interface UserClient {
    @GetMapping("/{userId}")
    UserDTO getUser(@PathVariable String userId);


}
