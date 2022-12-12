package com.SafetyNetAlerts.repository;

import com.SafetyNetAlerts.model.GlobalData;

public interface GlobalDataRepository {

    public GlobalData read();

    public void write(GlobalData data);
}
