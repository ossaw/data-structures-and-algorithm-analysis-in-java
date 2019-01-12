package com.github.source;// MemoryCell class
//  Object read( )         -->  Returns the stored value
//  void write( Object x ) -->  x is stored

public class MemoryCell<AnyType> {
    // Private internal data representation
    private AnyType storedValue;

    // Public methods
    public AnyType read() {
        return storedValue;
    }

    public void write(AnyType x) {
        storedValue = x;
    }
}
