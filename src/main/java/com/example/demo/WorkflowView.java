package com.example.demo;

import java.util.List;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.InverseRemoveStrategy;
import com.blazebit.persistence.view.MappingInverse;
import com.blazebit.persistence.view.UpdatableEntityView;
import com.blazebit.persistence.view.UpdatableMapping;

@EntityView(Workflow.class)
@CreatableEntityView
@UpdatableEntityView
public interface WorkflowView extends WorkflowIdView {

    @UpdatableMapping
    @MappingInverse(removeStrategy = InverseRemoveStrategy.REMOVE)
    List<WorkflowStepView> getSteps();
}
