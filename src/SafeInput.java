import java.util.Scanner;

public class SafeInput {

    
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retValue = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done);

        return retValue;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retValue2 = 0;
        String trash2 = "";
        boolean done2 = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue2 = pipe.nextDouble();
                pipe.nextLine();
                done2 = true;
            } else {
                trash2 = pipe.nextLine();
                System.out.println("You must enter a valid double value not: " + trash2);
            }
        }while (!done2);

        return retValue2;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retValue3 = 0;
        String trash = "";
        boolean done3 = false;
        do
        {
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue3 = pipe.nextInt();
                pipe.nextLine();
                if(retValue3 >= low && retValue3 <= high)
                    done3 = true;
                else System.out.println("\nNumber is out of ranage [" + low + " - " + high + "] not: " + retValue3);
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done3);

        return retValue3;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retValue4 = 0;
        String trash = "";
        boolean done4 = false;
        do
        {
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue4 = pipe.nextDouble();
                pipe.nextLine();
                if(retValue4 >= low && retValue4 <= high)
                    done4 = true;
                else System.out.println("\nNumber is out of ranage [" + low + " - " + high + "] not: " + retValue4);
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done4);

        return retValue4;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retValue5 = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                gotAVal = true;
                retValue5 = true;
            }
            else if (response.equalsIgnoreCase("N")) {
                gotAVal = true;
                retValue5 = false;
            }
            else {
                System.out.println("You must answer [Y/N]! " + response);
            }
        }while (!gotAVal);

        return retValue5;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String response2 = "";
        boolean gotAVal2 = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response2 = pipe.nextLine();
            if(response2.matches(regExPattern)) {
                gotAVal2 = true;
            }
            else {
                System.out.println("\n" + response2 + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }
        }while (!gotAVal2);

        return response2;

    }




}
