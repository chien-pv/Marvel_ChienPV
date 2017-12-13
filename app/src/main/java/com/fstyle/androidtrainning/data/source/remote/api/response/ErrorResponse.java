package com.fstyle.androidtrainning.data.source.remote.api.response;

import com.google.gson.annotations.Expose;

public class ErrorResponse {
    @Expose
    private String documentationUrl;
    @Expose
    private String message;

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public String getMessage() {
        return message;
    }
}
