package com.carmazing.product.resolver;

import com.carmazing.product.datasource.entity.Model;
import com.carmazing.product.generated.types.ModelInput;
import com.carmazing.product.service.query.ModelQueryService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@DgsComponent
public class ModelResolver {

    @Autowired
    private ModelQueryService modelQueryService;

    @DgsQuery
    public List<Model> models(@InputArgument Optional<ModelInput> modelInput) {
        return modelQueryService.findModels(modelInput);
    }
}
