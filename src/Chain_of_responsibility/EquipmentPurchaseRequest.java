package Chain_of_responsibility;

import java.math.BigDecimal;

/**
 * 教学器材购买请求
 */
public class EquipmentPurchaseRequest {
    //请求的金额
    private BigDecimal price;
    //请求id
    private int id;

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public EquipmentPurchaseRequest(BigDecimal price, int id) {
        this.price = price;
        this.id = id;
    }
}
