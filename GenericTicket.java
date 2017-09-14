


public abstract class GenericTicket {
    // declaring a static min and a max account balance
    static Double minAccountBalance = 0.0, maxAccountBalance = 50.0;

    // we only want classes that extend from GenericTicket to use these
    protected int block;
    protected int seat;

    // the default account balance
    private Double AccountBalance = 0.0;

    // abstract classes for the other tickets to use. Is used to see if the ticket is valid
    public abstract boolean isPlaceValid();
    public abstract boolean isPlaceValidToday();


    public Boolean modAccountBalance(Double amount) {

        /**
         * parameter: is the "amount" that gets added or subtracted from the customers bank account
         * creates the variable newAccountBalance, the old balance will be added or subtracted with the "amonunt"
         * return: if the newAccountBalance is withing the allowed limits the account Balance will be changed to the new account balance
         * return: else the newAccountBalance is out of bounds of the limits it will return false
         */
        Double newAccountBalance = AccountBalance + amount;
        if (newAccountBalance >= minAccountBalance &&
                newAccountBalance <= maxAccountBalance) {
            AccountBalance = newAccountBalance;
            return true;
        } else {
            return false;
        }
    }

    public int getBlock() {
        return block;
    }

    // sets the block for the ticket
    public void setBlock(int block) {
            this.block = block;
    }


    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
            this.seat = seat;
    }

    // returns the current account balance
    public Double getAccountBalance() {
        return AccountBalance;
    }





}



