package com.example.demo.controller;

import com.example.demo.dto.MainResponse;
import com.example.demo.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/main")
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping()
    public ResponseEntity<MainResponse> getInitialList() {
        MainResponse mainResponse = mainService.getInitialMissionList();

        return ResponseEntity.ok(mainResponse);
    }
}
