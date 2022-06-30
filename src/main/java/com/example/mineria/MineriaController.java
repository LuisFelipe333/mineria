package com.example.mineria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MineriaController {

    @GetMapping("/mineria")
    public String hello() {
        return String.format("JiJiJiJa, no me gusta Clash Royale");
    }

}
