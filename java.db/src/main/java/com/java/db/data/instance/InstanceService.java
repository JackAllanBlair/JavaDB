package com.java.db.data.instance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InstanceService {

    private final InstanceRepository instanceRepository;

    @Autowired
    public InstanceService(InstanceRepository instanceRepository) {
        this.instanceRepository = instanceRepository;
    }

    public List<DataInstance> getInstances() {
        return List.of(
                new DataInstance(
                        1L,
                        "Hi, this is me!",
                        LocalDate.of(2022, 11, 13)
                )
        );
    }
}
