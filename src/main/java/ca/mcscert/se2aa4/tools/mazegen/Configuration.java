package ca.mcscert.se2aa4.tools.mazegen;

import java.io.BufferedWriter;

public record Configuration(int width, int height, BufferedWriter out, long seed, boolean humanReadable) {
    public Configuration {
    }
    public static Configuration load(String[] args) {
        return null;
    }
}
