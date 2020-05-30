public class Main {

    public static void main(String[] args) {

        // CHALLENGE
        //
        // 1. Create a new class for a bank account.
        // 2. Create fields for the account number, balance, customer name, email & phone-number.
        // 3. Create getters and setters for each field.
        // 4. Create two additional methods:
        //      1. To allow the customer to deposit funds (this should increase the balance field).
        //      2. To allow the customer to withdraw funds (this should decrease the balance field).
        //
        //      But not allow the withdrawal to complete if there are insufficient funds.
        // 5. You will want to create various code in the main class to confirm your code is working.
        //      Add some System.out.println's in the two methods above as well.


        Account bobsAccount = new Account("12345", 0.00, "Bob SquarePants",
                "bob@gmail.com", "407-667-5432");


        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getAccountBalance());
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);



        // CHALLENGE
        //
        // 1. Create a new class vipCustomer
        // 2. It should have 3 fields name, credit limit, and email.
        // 3. Create 3 constructors
        //      1st constructor empty should call the constructor with 3 parameters with defaault values
        //      2nd constructor should pass on the 2 values it receives and add a default value for the 3rd.
        //      3rd constructor should save all fields.
        //      Create getters only for this using code generation of intelliJ as setters won't be needed.
        // Test and confirm it works.


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Patrick", 100.00, "Rick@mail.com");
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 200.00, "tim@mail.com");
        System.out.println(person3.getName());


    }
}
