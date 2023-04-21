package mx.finsus.back_remesas_api.service.impl;

import mx.finsus.back_remesas_api.model.AppData;
import mx.finsus.back_remesas_api.repository.IDataRepository;
import mx.finsus.back_remesas_api.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements IDataService {

    @Autowired
    private IDataRepository repository;

    @Override
    public List<AppData> findAll() {
        return repository.findAll();
    }
}
