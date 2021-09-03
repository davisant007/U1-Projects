import javax.swing.JOptionPane;
public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args) {
        double price;
        int quantity;

        quantity = Integer.parseInt(JOptionPane.showInputDialog("what is the quantity"));
        price = Double.parseDouble(JOptionPane.showInputDialog("what is the price"));

        double _tax = 7;
        double discount = .10;
        final double tax = _tax/100.0;

        double SubTotal = price * quantity;
        double TaxTotal = SubTotal * tax;
        double totalCost = SubTotal + TaxTotal;
        double total = price * (1 - discount);

        JOptionPane.showMessageDialog(null, "your subtotal is $ " + SubTotal + " Your tax is $ " + TaxTotal + " Your total is $ " + total );
        System.out.println("SubTotal " + SubTotal);
        System.out.println("Tax " + TaxTotal);
        System.out.println("Total " + totalCost);
    System.exit(0);


    }




}
