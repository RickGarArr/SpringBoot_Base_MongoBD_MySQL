package com.rga.mx.demo.controllers;

import com.rga.mx.demo.domain.dao.ResponseDTO;
import com.rga.mx.demo.entities.LogDocument;
import com.rga.mx.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("logs")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("")
    public ResponseDTO<List<LogDocument>> findAllLogs() {
        return this.logService.findAllLogs();
    }
}
