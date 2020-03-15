package Chain_of_responsibility;

import java.math.BigDecimal;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建一个器材购买请求
        EquipmentPurchaseRequest epr = new EquipmentPurchaseRequest(BigDecimal.valueOf(30001),1234);

        //创建审批人
        Director director = new Director("主任");
        Dean dean = new Dean("院长");
        VicePrincipal vp = new VicePrincipal("副校长");
        Principal p = new Principal("校长");

        //设置下一个审批人,最后一个审批人也要设置下一个，进行一个圆圈循环审批，回到原点，防止不懂从哪个审批人开始，然后没处理到
        director.setApprover(dean);
        dean.setApprover(vp);
        vp.setApprover(p);
        p.setApprover(director);

        //开始请求审批
        director.processRequest(epr);
    }
}
