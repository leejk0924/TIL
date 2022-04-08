package chapter03.ch3;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        super();
        bonusRatio = 0.5;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIP customer call");
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
