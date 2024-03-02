public class PR24_WrapperSample {
    public static void main(String[] args) {
        // Boolean wrapper class
        Boolean booleanWrapper = new Boolean(true);
        boolean booleanValue = booleanWrapper.booleanValue();
        System.out.println("Boolean value: " + booleanValue);

        // Byte wrapper class
        Byte byteWrapper = new Byte((byte) 10);
        byte byteValue = byteWrapper.byteValue();
        System.out.println("Byte value: " + byteValue);

        // Character wrapper class
        Character characterWrapper = new Character('a');
        char characterValue = characterWrapper.charValue();
        System.out.println("Character value: " + characterValue);

        // Short wrapper class
        Short shortWrapper = new Short((short) 20);
        short shortValue = shortWrapper.shortValue();
        System.out.println("Short value: " + shortValue);

        // Integer wrapper class
        Integer integerWrapper = new Integer(30);
        int integerValue = integerWrapper.intValue();
        System.out.println("Integer value: " + integerValue);

        // Long wrapper class
        Long longWrapper = new Long(40L);
        long longValue = longWrapper.longValue();
        System.out.println("Long value: " + longValue);

        // Float wrapper class
        Float floatWrapper = new Float(50.0F);
        float floatValue = floatWrapper.floatValue();
        System.out.println("Float value: " + floatValue);

        // Double wrapper class
        Double doubleWrapper = new Double(60.0D);
        double doubleValue = doubleWrapper.doubleValue();
        System.out.println("Double value: " + doubleValue);

    }
}
