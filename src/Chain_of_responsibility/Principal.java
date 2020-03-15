package Chain_of_responsibility;

import java.math.BigDecimal;

/**
 * 校长
 */
public class Principal extends Approver {
    public Principal(String name) {
        super(name);
    }

    @Override
    public void processRequest(EquipmentPurchaseRequest epr) {
        if (epr.getPrice().compareTo(BigDecimal.valueOf(30000))>=0) {
            System.out.println("请求编号："+epr.getId()+"被"+name+"处理");
        }else {
            approver.processRequest(epr);
        }
    }
}
