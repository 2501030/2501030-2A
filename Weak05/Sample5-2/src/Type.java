public class Type {
    private String TypeName;
    private int unitPrice;
    private float taxRate;

    public Type(String typeName, int unitPrice, float taxRate) {
        this.TypeName = TypeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
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
}
