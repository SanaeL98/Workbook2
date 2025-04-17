package workbook2;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        System.out.print("Enter full name: ");
        String fullName = Scanner.nextLine();

        System.out.print("Enter billing street: ");
        String billingStreet = Scanner.nextLine();

        System.out.print("Enter billing city: ");
        String billingCity = Scanner.nextLine();

        System.out.print("Enter billing state: ");
        String billingState = Scanner.nextLine();

        System.out.print("Enter billing zip: ");
        Double billingZip = Scanner.nextDouble();

        System.out.print("Enter shipping street: ");
        String ShippingStreet = Scanner.nextLine();

        System.out.print("Enter shipping city: ");
        String shippingCity = Scanner.nextLine();

        System.out.print("Enter shipping state: ");
        String shippingState = Scanner.nextLine();

        System.out.print("Enter shipping zip: ");
        String shippingZip = Scanner.nextLine();


        StringBuilder sb = new StringBuilder();

        sb.append(fullName).append("\n\n");

        sb.append("Billing Address:\n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n\n");

        sb.append("Shipping Address:\n");
        sb.append(ShippingStreet).append("\n");
        sb.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);


        System.out.println("\n" + sb);


    }
    }



