public class RomanTextRepresentation {

    public static String of(int aNumber){
        StringBuilder aStream = new StringBuilder();

        Integer hundreds = (new Double(aNumber/100).intValue())%100;
        Integer tens = (new Double(aNumber/10).intValue())%10;
        Integer units = aNumber % 10;

        convertDigitsUsing(hundreds, aStream, "C", "D", "M");
        convertDigitsUsing(tens, aStream, "X", "L", "C");
        convertDigitsUsing(units, aStream, "I", "V", "X");

        return aStream.toString();
    }

    public static void convertDigitsUsing(int aNumber, StringBuilder aStream, String asOne, String asFive, String asTen) {
        if (aNumber>=1 && aNumber<=3) {
            for (int i=1;i<=aNumber;i++) aStream.append(asOne);
        }
        if (aNumber==4){
            aStream.append(asOne).append(asFive);
        }
        if (aNumber>=5 && aNumber<=8) {
            aStream.append(asFive);
            for (int i=6;i<=aNumber;i++) aStream.append(asOne);
        }
        if (aNumber==9){
            aStream.append(asOne).append(asTen);
        }
    }
}
