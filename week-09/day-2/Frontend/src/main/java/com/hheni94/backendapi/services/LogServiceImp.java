package com.hheni94.backendapi.services;

import com.hheni94.backendapi.models.Log;
import com.hheni94.backendapi.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImp implements ILogService{

  LogRepository logRepository;

  @Autowired
  public LogServiceImp(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> listAllLog() {
    List<Log> logs = new ArrayList<>();
    logRepository.findAll().forEach(logs::add);
    return logs;
  }
}
