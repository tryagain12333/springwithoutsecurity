package com.example.springwithoutsecurity.Service;

import com.example.springwithoutsecurity.Model.Value;

import java.util.List;

public interface ValueService {
    public List<Value> getAllValues(String keyword);

    public void saveValue(Value theValue);

    public Value getValue(int theId);

    public void deleteValue(int theId);
}
