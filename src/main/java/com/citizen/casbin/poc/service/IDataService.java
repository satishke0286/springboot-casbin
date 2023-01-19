package com.citizen.casbin.poc.service;

import com.citizen.casbin.poc.model.Data;

public interface IDataService {
  void setState(String state);

  Data getSecuredData(String source);
}
