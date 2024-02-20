package org.genSecond;

import java.io.IOException;

public interface Lexer<T> {
    void nextToken() throws IOException;

    T getToken();
}
