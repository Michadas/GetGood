package org.example.responses;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@ApiModel(description = "Ok response")
@Data
@AllArgsConstructor
public class OkResponse {
    @ApiModelProperty(value = "message", required = true, position = 1)
    private String message;
}
