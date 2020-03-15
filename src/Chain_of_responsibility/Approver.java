package Chain_of_responsibility;

/**
 * 抽象审批者
 */
public abstract class Approver {
    //下一个处理审批的人
    Approver approver;
    //审批人名字
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //子类做具体处理审批对的方法
    public abstract void processRequest(EquipmentPurchaseRequest epr);
}
