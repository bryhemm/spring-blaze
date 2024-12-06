package com.example.demo;

import java.util.Map;

import com.blazebit.persistence.view.CascadeType;
import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.UpdatableEntityView;
import com.blazebit.persistence.view.UpdatableMapping;

@EntityView(WorkflowStep.class)
@CreatableEntityView
@UpdatableEntityView
public interface WorkflowStepView {
    @IdMapping
    Long getId();

    @UpdatableMapping(cascade = CascadeType.PERSIST)
    WorkflowIdView getWorkflow();
    void setWorkflow(WorkflowIdView workflow);
    
    Map<String, Object> getConfig();
}
