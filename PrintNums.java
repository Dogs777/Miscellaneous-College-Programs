class PrintNums
{
    public static void main(String args[])
    {
        // Print a truth table for a three-bit relative magnitude detector.

        System.out.println("X2 | X1 | X0 | Y2 | Y1 | Y0 | M | N | P"); // Print the column identifying row.
        System.out.println("---|----|----|----|----|----|---|---|--"); // Print a dashed separating line.

        for (int i = 0; i < 64; i++) // Print the rows.
        {
            // Convert i to a six bit binary number and store it as a string.

            String binaryNumber = "00000" + Integer.toBinaryString(i); // Append leading zeroes to the binary number.
            binaryNumber = binaryNumber.substring(binaryNumber.length() - 6, binaryNumber.length());  // Cull the leading zeroes to ensure a six-bit binary number.

            // Print the current binary value of i in truth table form.

            for (int i2 = 0; i2 < 6; i2++)
                System.out.print(binaryNumber.charAt(i2) + "  | ");

            // Print the truth table results.

            char x2 = binaryNumber.charAt(0),
                x1 = binaryNumber.charAt(1),
                x0 = binaryNumber.charAt(2),
                y2 = binaryNumber.charAt(3),
                y1 =binaryNumber.charAt(4),
                y0 = binaryNumber.charAt(5);

            if (x2 == y2)
                if(x1 == y1)
                    if (x0 == y0)
                        System.out.println("1 | 0 | 0");

                    else if (x0 > y0)
                        System.out.println("0 | 1 | 0");
                    
                    else
                        System.out.println("0 | 0 | 1");

                else if (x1 > y1)
                    System.out.println("0 | 1 | 0");
                    
                else
                    System.out.println("0 | 0 | 1");

            else if (x2 > y2)
                System.out.println("0 | 1 | 0");

            else
                System.out.println("0 | 0 | 1");
        } // End for (int i = 0; i < 64; i++).
    } // End public static void main(String args[]).
} // End class PrintNums.
