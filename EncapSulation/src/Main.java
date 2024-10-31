//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Shofique");
        person1.setAge(35);
        System.out.println("Name: "+person1.getName() +"\t Age:"+ person1.getAge() );

        BankAccount bAccount = new BankAccount();
        bAccount.setAcc_no(343322);
        bAccount.setName("Kamruzzaman");
        bAccount.setAmount(5634.90F);
        bAccount.setEmail("kaz@java.com");
        System.out.println("Account no:\t"+bAccount.getAcc_no());
        System.out.println("Name:\t"+bAccount.getName());
        System.out.println("Email:\t"+bAccount.getEmail());
        System.out.println("Balance:\t"+bAccount.getAmount());
    }
}