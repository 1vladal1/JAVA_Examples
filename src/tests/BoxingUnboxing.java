package tests;

public class BoxingUnboxing {

    public static void main(String[] args) {
        //Primitives
        boolean aBoolean = true;
        char aChar = 'x';
        byte aByte = 0;
        short aShort = 0;
        int anInt = 0;
        long aLong = 0L;
        float aFloat = 0.0F;
        double aDouble = 0.0D;

        //Boxing
        Boolean aBooleanClass = aBoolean;
        Character aCharClass = aChar;
        Byte aByteClass = aByte;
        Short aShortClass = aShort;
        Integer anIntClass = anInt;
        Long aLongClass = aLong;
        Float aFloatClass = aFloat;
        Double aDoubleClass = aDouble;

        //Unboxing
        boolean bool = aBooleanClass;
        char ch = aCharClass;
        byte b = aByteClass;
        short s = aShortClass;
        int i = anIntClass;
        long l = aLongClass;
        float f = aFloatClass;
        double d = aDoubleClass;
    }
}

