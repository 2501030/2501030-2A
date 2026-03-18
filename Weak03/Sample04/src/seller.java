public class Seller {
    private Apple apple;
    private int myMoney;

    public Seller(Apple apple, int myMoney) {
        this.apple = apple;
        this.myMoney = myMoney;
    }

    public Apple getApple() {
        return apple;
    }

    public int getMyMoney() {
        return myMoney;
    }

    public boolean sale(int count) {
        boolean flag = true;
        if (apple.getInventory() >= count) {
            apple.setInventory(apple.getInventory() - count);
            myMoney += (count * apple.getPrice());
        } else {
            System.err.println("ERROR : 사과 재고 수량 부족합니다.");
            flag = false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return String.format();
    }
}
