package com.hheni94.backendapi.services;

import com.hheni94.backendapi.models.Log;

import java.util.List;

public interface ILogService {
  void save(Log log);
  List<Log> listAllLog();
}
