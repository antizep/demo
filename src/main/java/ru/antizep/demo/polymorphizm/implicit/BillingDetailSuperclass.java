package ru.antizep.demo.polymorphizm.implicit;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BillingDetailSuperclass {
    protected String owner;
}
