package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by vlad
 */

class WrapCheckException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: { throw new FileNotFoundException(); }
                case 1: { throw new IOException(); }
                case 2: { throw new RuntimeException("Where I?"); }
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {
}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckException wrapCheckException = new WrapCheckException();
        wrapCheckException.throwRuntimeException(3);
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3)
                    wrapCheckException.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                System.err.println("SomeOtherException " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    System.err.println("FileNotFoundException " + e);
                } catch (IOException e) {
                    System.err.println("IOException " + e);
                } catch (Throwable e) {
                    System.err.println("Throwable " + e);
                }
            }
        }
    }
}
