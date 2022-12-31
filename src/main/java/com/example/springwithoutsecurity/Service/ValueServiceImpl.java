package com.example.springwithoutsecurity.Service;


import com.example.springwithoutsecurity.DAO.ValueDAO;
import com.example.springwithoutsecurity.Model.Value;
import com.example.springwithoutsecurity.Model.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ValueServiceImpl implements ValueService{
    @Autowired
    private ValueRepository repo;
    @Autowired
    private ValueDAO valueDAO;
    @Override
    @Transactional
    public List<Value> getAllValues(String keyword) {
//        return valueDAO.getAllValues(keyword);
        if (keyword != null) {
            return repo.search(keyword);
        }
        else {
            return valueDAO.getAllValues(keyword);
        }
    }

    @Override
    @Transactional
    public void saveValue(Value theValue) {
        valueDAO.saveValue(theValue);
    }

    @Override
    @Transactional
    public Value getValue(int theId) {
        return valueDAO.getValue(theId);
    }

    @Override
    @Transactional
    public void deleteValue(int theId) {
        valueDAO.deleteValue(theId);
    }
}
