package org.project.entity;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends CouchDbDocument {

    @TypeDiscriminator
    private String name;
    private String email;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private List<Transaction> transactions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


