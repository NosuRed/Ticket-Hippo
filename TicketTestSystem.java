import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketTestSystem {

    public static void main(String[] args) {
        String BORDER = "~~~~~~~~~~~~~~~~";

        /*
         this block is used to showcase the case of checking the name and last name on the ticket,
         to show that we can determine a member with a boolean value,
         that we can set a member id
         */

        Member newMember = new Member("David","Behrens",LocalDate.of(1994,7,11),9999);
        Customer newGuest1 = new Customer("Philipp","Behrens", LocalDate.of(1994,7,11));
        newGuest1.setTicket(new GuestTicket(LocalDate.of(2017,9,14),10));
        newMember.setTicket(new SeasonTicket(LocalDate.of(2017,1,1),LocalDate.of(2017,12,31),95555,55));

        System.out.println(newMember.isMember());
        System.out.println(newMember.getBirthDate());
        System.out.println("Checks if a member is considered a member: " +" This will return true: " + newMember.isMember());
        System.out.println("Checks if a guest is a member, " +  "since guests can't be members it will return:" + " " + newGuest1.isMember());
        System.out.println(BORDER);
        Entry entry = new Entry();
        System.out.println(entry.checkName(newGuest1));
        System.out.println(entry.checkTicket(newGuest1));


        /*
        //Enable other tests! It starts here :)
        // is old enough to buy anything
        Member member1 = new Member("Nosu", "Red", LocalDate.of(1994, 7, 11),1);

        // member2 is not old enough to buy alcohol
        Member member2 = new Member("Kuroha","Demon",LocalDate.of(2010,12,24),2);

        // membership expired
        Member member3 = new Member("Aku","Metzu",LocalDate.of(1994,7,11),3);


        // guest1 is younger than 18 and should only be able to buy beverage for his age
        Customer guest1 = new Customer("Rheagus","idk",LocalDate.of(2000,12,31));

        // guest2 is barely 18
        Customer guest2 = new Customer("Seawolf","LazerKat",LocalDate.of(1999,1,1));

        // Tried to sneak into another block.
        Customer guest3 = new Customer("Darkroms","LazerKat",LocalDate.of(1999,1,1));

        // dailyTicket1 is old enough to buy anything
        Customer dailyTicket1 = new Customer("Nigel","Ridel",LocalDate.of(1980,12,31));

        // dailyTicket2 is old enough to buy anything
        Customer dailyTicket2 = new Customer("Yorika","Demon",LocalDate.of(1995,6,10));


        member1.setTicket(new SeasonTicket(LocalDate.of(2017, 1, 1),LocalDate.of(2017, 12, 31), member1.getMemberID(),14));
        member2.setTicket(new SeasonTicket(LocalDate.of(2017, 1, 1),LocalDate.of(2017, 12, 15), member1.getMemberID(),5));
        member3.setTicket(new SeasonTicket(LocalDate.of(2017, 1, 1),LocalDate.of(2017, 6, 15), member1.getMemberID(),5));
        guest1.setTicket(new GuestTicket(LocalDate.now(), 0));
        guest2.setTicket(new GuestTicket(LocalDate.now(), 5));
        guest3.setTicket(new GuestTicket(LocalDate.now(), 15));
        dailyTicket1.setTicket(new DayTicket(LocalDate.now(),10,15));
        dailyTicket2.setTicket(new DayTicket(LocalDate.of(2016, 1, 11), 15, 99));



        member1.getTicket().modAccountBalance(15.0);
        if(!member3.getTicket().modAccountBalance(-20.0)){
            System.out.println(member3.firstName +" this amount is not possible");
        }else{
            System.out.println("Error: Successfully added an impossible amount of money ");
        }

        member2.getTicket().modAccountBalance(50.0);

        guest1.getTicket().modAccountBalance(50.0);

        guest2.getTicket().modAccountBalance(6.25);

        guest3.getTicket().modAccountBalance(40.0);

        dailyTicket1.getTicket().modAccountBalance(5.0);

        if(!dailyTicket2.getTicket().modAccountBalance(51.0)){
            System.out.println(dailyTicket2.firstName +" this amount is not possible");
        }else{
            System.out.println("Error: Successfully added an impossible amount of money ");
        }




        Entry entry = new Entry();

        ArrayList<Customer> customerTable = new ArrayList<>();
        customerTable.add(member1);
        customerTable.add(member2);
        customerTable.add(member3);
        customerTable.add(guest1);
        customerTable.add(guest2);
        customerTable.add(guest3);
        customerTable.add(dailyTicket1);
        customerTable.add(dailyTicket2);

        ArrayList<Customer> validDateCustomers = new ArrayList<>();
        System.out.println("~~~~~~~~~~~~~~");
        System.out.println("Checking if the date on the ticket is valid: ");
        // Checks if the Date of the game fits with the Customers ticket
        for(Customer c : customerTable){
            if(!entry.checkTicket(c)){
                System.out.println("Your ticket is not valid "+c.firstName);

            // adds valid tickets to a new list
            }else{
                System.out.println("Your ticket is valid "+c.firstName);
                validDateCustomers.add(c);
            }
        }
        System.out.println("~~~~~~~~~~~~~~");


        // if the blocks or seats are smaller than 1 or bigger than 99, the ticket is invalid
        System.out.println("Checking if the blocks and seats are valid:");
        // creating a new list with tickets that where valid in the first test
        ArrayList<Customer> validBlockSeat = new ArrayList<>();
        for(Customer c: validDateCustomers){
            //Checks if the blocks and seats are in a valid range
            if(c.getTicket().block >99 | c.getTicket().block <1 | c.getTicket().seat<1 | c.getTicket().seat >99) {
                System.out.println("Your ticket is invalid " + c.firstName+ " block: "+ c.getTicket().block + " and seat: " + c.getTicket().seat + " are not valid!");
            // add the valid tickets to a new list
            }else if (c.getTicket().block <= 10 | c.getTicket().block >= 19){
                validBlockSeat.add(c);
                System.out.println("Your ticket is valid " +c.firstName );

            } else{
            validBlockSeat.add(c);
            System.out.println("Your ticket is valid " +c.firstName);
            }
        }
        System.out.println("Enjoy the game!");
        System.out.println("~~~~~~~~~~~~~~");

        System.out.println("Checking the account balance for each valid ticket:");
        for(Customer c : validBlockSeat){
            System.out.println(c.firstName+ " " +c.getTicket().getAccountBalance()+" Euro");
        }

        System.out.println("~~~~~~~~~~~~~~");

        // creating a new bar
        Bar bar = new Bar();

        // adding three beverages for testing purposes
        // used to check if the price is subtracted correctly
        // used check if the ages restriction works as intended
        bar.addBeverage(new Beverage("Beer",6.25,16));
        bar.addBeverage(new Beverage("Pepsi",3.0,0));
        bar.addBeverage(new Beverage("Vodka",10.90,18));

        // quick test for one beverage, also can be used to check if money will be subtracted when pared
        // with the test below
        for (Customer c : validBlockSeat){
            bar.order("Vodka", c);
        }
        // testing more account handling + age restriction with different beverages
        System.out.println("~~~~~~~~~~~~~~");
        bar.order("Pepsi", member1);
        bar.order("Vodka", member2);
        bar.order("Vodka", guest1);
        bar.order("Beer", guest1);
        bar.order("Beer", guest2);

        System.out.println("~~~~~~~~~~~~~~");
        //Remove this and the one at the beginning to enable the test!*/


    }
}