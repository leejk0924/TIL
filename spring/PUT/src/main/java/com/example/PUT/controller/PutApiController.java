package com.example.PUT.controller;

import com.example.PUT.dto.CarDto;
import com.example.PUT.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class PutApiController {
    @PutMapping(path = "/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(requestDto);
        System.out.println(id);
        return requestDto;
    }
}
