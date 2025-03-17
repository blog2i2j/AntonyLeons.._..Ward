package dev.leons.ward.dto;

public class TransferDto {

    /**
     * Download transfer rate field
     */
    private String download;

    /**
     * Upload transfer rate field
     */
    private String upload;

    /**
     * Gets download transfer rate
     *
     * @return download transfer rate
     */
    public String getDownload() {
        return download;
    }

    /**
     * Sets download transfer rate
     *
     * @param download download transfer rate
     */
    public void setDownload(String download) {
        this.download = download;
    }

    /**
     * Gets upload transfer rate
     *
     * @return upload transfer rate
     */
    public String getUpload() {
        return upload;
    }

    /**
     * Sets upload transfer rate
     *
     * @param upload upload transfer rate
     */
    public void setUpload(String upload) {
        this.upload = upload;
    }

    
}
