package Chain_of_responsibility;

import java.math.BigDecimal;

/**
 * 教导主任
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(EquipmentPurchaseRequest epr) {
        if (epr.getPrice().compareTo(BigDecimal.valueOf(5000))<=0) {
            System.out.println("请求编号："+epr.getId()+" 被"+name+"处理");
        }else {
            approver.processRequest(epr);
        }
    }
}
