package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "TestFeignClient", url = "https://jsonplaceholder.typicode.com/posts")
public interface TestFeignClient {

    @GetMapping
    String getPosts(@RequestParam("filter[param]") String param);
}
