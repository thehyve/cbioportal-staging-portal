package org.cbioportal.staging.service.exception;

public class UploadRequestNotFoundException extends Exception {

    private int uploadRequestId;

    public UploadRequestNotFoundException(int uploadRequestId) {
        super();
        this.uploadRequestId = uploadRequestId;
    }

    public int getuploadRequestId() {
        return uploadRequestId;
    }

    public void setUploadRequestId(int uploadRequestId) {
        this.uploadRequestId = uploadRequestId;
    }
}
