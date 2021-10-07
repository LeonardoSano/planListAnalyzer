package com.example.demo.supremaziatotale;

import java.util.Date;

public class PlanList {

    //prova commit 2
    private String nome;
    private boolean trial;
    private String subscriptionCyclicity;
    private double paymentDuePrice;
    private Date paymentDueDate;

    public PlanList(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTrial() {
        return trial;
    }

    public void setTrial(boolean trial) {
        this.trial = trial;
    }

    public String getSubscriptionCyclicity() {
        return subscriptionCyclicity;
    }

    public void setSubscriptionCyclicity(String subscriptionCyclicity) {
        this.subscriptionCyclicity = subscriptionCyclicity;
    }

    public double getPaymentDuePrice() {
        return paymentDuePrice;
    }

    public void setPaymentDuePrice(double paymentDuePrice) {
        this.paymentDuePrice = paymentDuePrice;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    @Override
    public String toString() {
        return "PlanList{" +
                "nome='" + nome + '\'' +
                ", trial='" + trial + '\'' +
                ", subscriptionCyclicity='" + subscriptionCyclicity + '\'' +
                ", paymentDuePrice='" + paymentDuePrice + '\'' +
                ", paymentDueDate='" + paymentDueDate + '\'' +
                '}';
    }
}
