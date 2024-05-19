package com.example.demo.controller;

import com.example.demo.dto.MainResponse;
import com.example.demo.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/main")
@RequiredArgsConstructor
@Slf4j
public class MainController {
    private final MainService mainService;

    @GetMapping()
    public ResponseEntity<MainResponse> getInitialList() {
        log.info("test log 입니다.");
        MainResponse mainResponse = mainService.getInitialMissionList();

        return ResponseEntity.ok(mainResponse);
    }
}
