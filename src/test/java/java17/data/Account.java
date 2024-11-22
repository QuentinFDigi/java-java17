package java17.data;

public class Account {

    private Person owner;
    private Integer balance;

    public Person getOwner() {
        return owner;
    }

    public Account setOwner(Person owner) {
        this.owner = owner;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public Account setBalance(Integer balance) {
        this.balance = balance;
        return this;
    }
}
