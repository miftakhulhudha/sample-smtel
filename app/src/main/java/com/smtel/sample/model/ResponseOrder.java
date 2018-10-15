package com.smtel.sample.model;

import java.io.Serializable;
import java.util.Date;

public class ResponseOrder implements Serializable {

    private long id;
    private String status;
    private String invoiceId;
    private int mcc;
    private int mnc;
    private int lac;
    private int cid;
    private long productId;
    private long userId;
    private String phoneNumber;
    private long clientId;
    private OrderDetail mkiosOrderDetail;
    private Date updatedAt;
    private Date createdAt;
    private long serverTrxId;
    private String srcMessage;
    private int hpp;
    private double amount;
    private double adminFee;
    private DetailTrx mkiosDetailTrx;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getMcc() {
        return mcc;
    }

    public void setMcc(int mcc) {
        this.mcc = mcc;
    }

    public int getMnc() {
        return mnc;
    }

    public void setMnc(int mnc) {
        this.mnc = mnc;
    }

    public int getLac() {
        return lac;
    }

    public void setLac(int lac) {
        this.lac = lac;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public OrderDetail getMkiosOrderDetail() {
        return mkiosOrderDetail;
    }

    public void setMkiosOrderDetail(OrderDetail mkiosOrderDetail) {
        this.mkiosOrderDetail = mkiosOrderDetail;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getServerTrxId() {
        return serverTrxId;
    }

    public void setServerTrxId(long serverTrxId) {
        this.serverTrxId = serverTrxId;
    }

    public String getSrcMessage() {
        return srcMessage;
    }

    public void setSrcMessage(String srcMessage) {
        this.srcMessage = srcMessage;
    }

    public int getHpp() {
        return hpp;
    }

    public void setHpp(int hpp) {
        this.hpp = hpp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(double adminFee) {
        this.adminFee = adminFee;
    }

    public DetailTrx getMkiosDetailTrx() {
        return mkiosDetailTrx;
    }

    public void setMkiosDetailTrx(DetailTrx mkiosDetailTrx) {
        this.mkiosDetailTrx = mkiosDetailTrx;
    }
}
