package com.carmazing.sales.constant;

public class ProductConstants {

    private ProductConstants() {

    }

    public static final String QUERY_SIMPLE_MODELS =
            """
           query simpleModels($modelUuids: [String!]!) {
             simpleModels(modelUuids: $modelUuids) {
               uuid
               name
               onTheRoadPrice
               exteriorColor
               interiorColor
               releaseYear
               transmission
               fuel
             }
           }            
            """;

    public static final String OPERATION_NAME_SIMPLE_MODELS = "simpleModels";

    public static final String VARIABLE_NAME_MODEL_UUIDS = "modelUuids";

}
