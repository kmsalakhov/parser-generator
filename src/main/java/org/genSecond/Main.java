package org.genSecond;

import org.genSecond.Parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("input.txt")) {
            Parser parser = new Parser(reader);
            System.out.println(parser.block(new block_in()).getTree());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
