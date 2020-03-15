package Chain_of_responsibility;

import java.math.BigDecimal;

/**
 * 副校长
 */
public class VicePrincipal extends Approver{
    public VicePrincipal(String name) {
        super(name);
    }

    @Override
    public void processRequest(EquipmentPurchaseRequest epr) {
        if (epr.getPrice().compareTo(BigDecimal.valueOf(10000))>=0&&epr.getPrice().compareTo(BigDecimal.valueOf(30000))<=0) {
            System.out.println("请求编号："+epr.getId()+" 被"+name+"处理");
        }else {
            approver.processRequest(epr);
        }
    }
}
