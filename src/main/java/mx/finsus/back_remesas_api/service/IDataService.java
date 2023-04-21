package mx.finsus.back_remesas_api.service;

import mx.finsus.back_remesas_api.model.AppData;

import java.util.List;

public interface IDataService {


    public List<AppData> findAll();
}
