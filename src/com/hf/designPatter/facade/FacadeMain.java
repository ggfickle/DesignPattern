package com.hf.designPatter.facade;

import javax.annotation.Resource;

public class FacadeMain {

    private final AdminOfIndustry adminOfIndustry = new AdminOfIndustry();

    private final Bank bank = new Bank();

    private final Taxation taxation = new Taxation();

    public void openCompany(String name) {
        adminOfIndustry.register(name);
        bank.openAccount(name);
        taxation.applyTaxCode(name);
    }
}
