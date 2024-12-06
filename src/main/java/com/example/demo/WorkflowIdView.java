package com.example.demo;

import org.springframework.lang.NonNull;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;

@EntityView(Workflow.class)
public interface WorkflowIdView {
        @IdMapping
    Long getId();

}
