package ru.uilyam.and.kate.pub.stuff.staffassistant.service.impl;

import ru.uilyam.and.kate.pub.stuff.staffassistant.moodels.dto.EmployeeDTO;
import ru.uilyam.and.kate.pub.stuff.staffassistant.service.interfaces.EmployeeService;

import java.util.HashMap;

public class EmployeeServiceImpl implements EmployeeService {
    private final HashMap<Integer, EmployeeDTO> employees = new HashMap<>();
    private long lastId;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return null;
    }
}
