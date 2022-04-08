package chapter03.ch4;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        super();
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
//        System.out.println("VIP customer call");
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price *salesRatio);
        return price;
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentID() {
        return agentID;
    }
}
