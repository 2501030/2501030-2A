public class Type {
    private String TypeName;
    private int unitPrice;
    private float taxRate;
    private String message;

    public Type(String typeName, int unitPrice, float taxRate) {
        this.TypeName = TypeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
        this.message = message;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public String getTypeName() {
        return TypeName;
    }
    public float getTaxRate() {
        return taxRate;
    }
    public String getMessage() {
        return message;
    }
}
