package com.example.fitnessapp.user;

import java.util.List;

public class DietProcessTab {
    private List<DietProcessRaw> ProcessTable;

    public DietProcessTab(List<DietProcessRaw> processTable) {
        ProcessTable = processTable;
    }

    public List<DietProcessRaw> getProcessTable() {
        return ProcessTable;
    }

    public void setProcessTable(List<DietProcessRaw> processTable) {
        ProcessTable = processTable;
    }

    @Override
    public String toString() {
        return "DietProcessTab{" +
                "ProcessTable=" + ProcessTable +
                '}';
    }
}
