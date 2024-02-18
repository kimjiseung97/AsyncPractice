package dev.be.async.controller;

import dev.be.async.service.AsyncService;
import dev.be.async.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncService asyncService;

    @GetMapping("/1")
    public void asyncCall_1(){
        asyncService.asyncCall_1();
    }

    @GetMapping("/2")
    public void asyncCall_2(){
        asyncService.asyncCall_2();
    }

    @GetMapping("/3")
    public void asyncCall_3(){
        asyncService.asyncCall_3();
    }
}
