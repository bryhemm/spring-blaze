package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blazebit.persistence.view.EntityViewManager;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/workflow")
public class WorkflowController {
    @Autowired
    private EntityManager em;
    @Autowired
    private EntityViewManager evm;

    @GetMapping("/test")
    @Transactional
    public WorkflowView test() {
        var step1 = evm.create(WorkflowStepView.class);
        var wf = evm.create(WorkflowView.class);

        wf.getSteps().add(step1);

        evm.save(em, wf);
        return wf;
    }
    
}
