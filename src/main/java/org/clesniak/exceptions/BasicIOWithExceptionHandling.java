package org.clesniak.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;


public class BasicIOWithExceptionHandling {
    private static final String FILENAME = "chair.csv";
    private static final String INVALIDFILENAME = "choir.csv";

    public void readFileNotFound() {

        try (var stream = Files.lines(Paths.get(INVALIDFILENAME))) {
            //empty
        } catch(IOException e) {
            System.out.println("Caught IO Exception");
            System.out.println(e);
        }

    }

    public void readFileNotFound_RethrowException() throws NoSuchFileException {

        try (var stream = Files.lines(Paths.get(INVALIDFILENAME))) {
            //empty
        } catch(IOException e) {
            if (e instanceof NoSuchFileException) {
                throw new NoSuchFileException("We did not find a file. " + INVALIDFILENAME);
            }
        }

    }

}
