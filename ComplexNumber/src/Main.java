//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComplexNumber complexNumber1 = new ComplexNumber(30, 20);
        ComplexNumber complexNumber2 = new ComplexNumber(60, 40);

        // printing complex numbers
        System.out.print("first Complex number: ");
        complexNumber1.showC();
        // printing complex numbers
        System.out.print("second Complex number: ");
        complexNumber2.showC();

       ComplexNumber res =  ComplexNumber.add(complexNumber1, complexNumber2);

        System.out.println("\nAddition is :");
        res.showC();
    }
}