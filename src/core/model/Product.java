package core.model;
import java.util.UUID;

public class Product {
    private UUID UUID ;
    private String reference;
    protected byte units;
    private String createDate;
    private String modifyDate;

    public Product(String reference, byte units, String createDate, String modifyDate) {
        this.UUID = UUID.randomUUID();
        this.reference = reference;
        this.units = units;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }

    public void setUUID(java.util.UUID UUID) {
        this.UUID = UUID;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public byte getUnits() {
        return units;
    }

    public void setUnits(byte units) {
        this.units = units;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }
}

