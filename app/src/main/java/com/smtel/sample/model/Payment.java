package com.smtel.sample.model;

import java.util.Date;

public class Payment {

    private long id;
    private String status;
    private String invoiceId;
    private int mcc;
    private int mnc;
    private int lac;
    private int cid;
    private String phoneNumber;
    private String customerId;
    private int period;
    private double cost;
    private String hpp;
    private String amount;
    private String adminFee;
    private String serverTrxId;
    private String struk;
    private String strukImageUrl;
    private String trxSerialNumber;
    private String productSerialNumber;
    private String scrMessage;
    private String resMessage;
    private int qty;
    private int amountPerItem;
    private double npAmount;
    private OrderDetail mkiosOrderDetail;
    private DetailTrx mkiosDetailTrx;
    private Date createdAt;
    private Date updatedAt;
    private long productId;
    private long userId;
    private long clinetId;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getHpp() {
        return hpp;
    }

    public void setHpp(String hpp) {
        this.hpp = hpp;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(String adminFee) {
        this.adminFee = adminFee;
    }

    public String getServerTrxId() {
        return serverTrxId;
    }

    public void setServerTrxId(String serverTrxId) {
        this.serverTrxId = serverTrxId;
    }

    public String getStruk() {
        return struk;
    }

    public void setStruk(String struk) {
        this.struk = struk;
    }

    public String getStrukImageUrl() {
        return strukImageUrl;
    }

    public void setStrukImageUrl(String strukImageUrl) {
        this.strukImageUrl = strukImageUrl;
    }

    public String getTrxSerialNumber() {
        return trxSerialNumber;
    }

    public void setTrxSerialNumber(String trxSerialNumber) {
        this.trxSerialNumber = trxSerialNumber;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    public String getScrMessage() {
        return scrMessage;
    }

    public void setScrMessage(String scrMessage) {
        this.scrMessage = scrMessage;
    }

    public String getResMessage() {
        return resMessage;
    }

    public void setResMessage(String resMessage) {
        this.resMessage = resMessage;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getAmountPerItem() {
        return amountPerItem;
    }

    public void setAmountPerItem(int amountPerItem) {
        this.amountPerItem = amountPerItem;
    }

    public double getNpAmount() {
        return npAmount;
    }

    public void setNpAmount(double npAmount) {
        this.npAmount = npAmount;
    }

    public OrderDetail getMkiosOrderDetail() {
        return mkiosOrderDetail;
    }

    public void setMkiosOrderDetail(OrderDetail mkiosOrderDetail) {
        this.mkiosOrderDetail = mkiosOrderDetail;
    }

    public DetailTrx getMkiosDetailTrx() {
        return mkiosDetailTrx;
    }

    public void setMkiosDetailTrx(DetailTrx mkiosDetailTrx) {
        this.mkiosDetailTrx = mkiosDetailTrx;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    public long getClinetId() {
        return clinetId;
    }

    public void setClinetId(long clinetId) {
        this.clinetId = clinetId;
    }
}
