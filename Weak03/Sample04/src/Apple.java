public class Apple {
    private int price;
    private int inventory;

    public Apple(int prive, int inventory) {
        this.price = prive;
        this.inventory = inventory;
    }

    public void getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return String.format(" 품목 이름 : %s,가격 : %,d원, 재고량 : %,d개", "사과", price, inventory);
    }
}
