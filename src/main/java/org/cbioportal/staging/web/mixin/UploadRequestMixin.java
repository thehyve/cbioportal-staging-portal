package org.cbioportal.staging.web.mixin;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UploadRequestMixin {
    @JsonProperty("urId")
    private Integer uploadRequestId;
    
}
