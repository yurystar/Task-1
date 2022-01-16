package com.senla.elhoteladmin.dao;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import com.senla.elhoteladmin.entity.AdditionalService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdditionalServiceDaoImpl implements IAdditionalServiceRepo {
    private static AdditionalServiceDaoImpl instance;

    public static synchronized AdditionalServiceDaoImpl getInstance() {
        if (instance == null) {
            instance = new AdditionalServiceDaoImpl();
        }
        return instance;
    }

    private final List<AdditionalService> additionalServices = new ArrayList<>();


    @Override
    public AdditionalService get(Integer additionalServiceID) {
        AdditionalService service = null;
        if (additionalServiceID>0 && additionalServiceID < additionalServices.size()) {
            service = additionalServices.get(additionalServiceID);
        }
        return service;
    }

    @Override
    public List<AdditionalService> getAll() {
        return additionalServices;
    }

    @Override
    public void save(AdditionalService additionalService) {
        additionalServices.add(additionalService);
    }

    @Override
    public void update(AdditionalService additionalService) {
        if (!additionalServices.contains(additionalService)) {
            additionalServices.add(additionalService);
        } else {
            System.out.println("Such an object already exists!");
        }
    }

    @Override
    public void delete(AdditionalService additionalService) {
        additionalServices.remove(additionalService);
    }

    @Override
    public List<AdditionalService> getListAdditionalServicesSortedByPrice() {
        return additionalServices.stream()
                .sorted(Comparator.comparingInt(AdditionalService::getServicePrice))
                .collect(Collectors.toList());
    }
}
