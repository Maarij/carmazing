package com.carmazing.product.resolver;

import com.carmazing.product.datasource.entity.Manufacturer;
import com.carmazing.product.generated.types.ManufacturerInput;
import com.carmazing.product.service.query.ManufacturerQueryService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@DgsComponent
public class ManufacturerResolver {

    @Autowired
    private ManufacturerQueryService manufacturerQueryService;

    @DgsQuery
    public List<Manufacturer> manufacturers(@InputArgument Optional<ManufacturerInput> manufacturerInput) {
        return manufacturerQueryService.findManufacturers(manufacturerInput);
    }
}
