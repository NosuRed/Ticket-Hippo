


public abstract class GenericTicket {
    // declaring a static min and a max account balance
    static Double minAccountBalance = 0.0, maxAccountBalance = 50.0;

    // we only want classes that extend from GenericTicket to use these
    protected int block;
    protected int seat;

    // account balance, its 0 euro by default
    private Double AccountBalance = 0.0;

    // abstract classes for the other tickets to use. Is used to see if the ticket is valid
    public abstract boolean isPlaceValid();
    public abstract boolean isPlaceValidToday();




    /**
     * the method changes the AccountBalance by the determined amount
     * @param amount is a double it represents the amount of money that is either added or subtracted
     * if the amount is valid, the AccountBalance will be change accordingly
     * @return  if the transaction succeeded or not
     */
    public Boolean modAccountBalance(Double amount) {
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


    public void setBlock(int block) {
            this.block = block;
    }


    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
            this.seat = seat;
    }

    public Double getAccountBalance() {
        return AccountBalance;
    }





}



