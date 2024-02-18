package dev.be.async.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    @Async("defaultTaskExucuter")
    public void sendMail(){
        System.out.println("ThreadName = " + Thread.currentThread().getName());
    }
    @Async("messageTaskExucuter")
    public void sendMailWithCustomThreadPool(){
        System.out.println("ThreadName = " + Thread.currentThread().getName());
    }


}
