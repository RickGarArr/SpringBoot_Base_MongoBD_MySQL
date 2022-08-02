package com.rga.mx.demo.services;

import com.rga.mx.demo.domain.dao.ResponseDTO;
import com.rga.mx.demo.entities.LogDocument;
import com.rga.mx.demo.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public ResponseDTO findAllLogs() {
        ResponseDTO<List<LogDocument>> response = new ResponseDTO<>();
        try {
            response.setData(this.logRepository.findAll());
            response.setMessage("ok");
        } catch (Exception ex) {
            response.setError(ex.getMessage());
        }
        return response;
    }
}
