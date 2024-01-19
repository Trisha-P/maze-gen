package ca.mcscert.se2aa4.tools.mazegen;

public class Configuration {

    public Configuration(String[] args) { }

    public long seed() { return System.currentTimeMillis(); }

    public int width() { return 41; }

    public int height() { return 41; }

    public BufferedWriter outputFile() {
        return new BufferedWriter(new OutputStreamWriter(System.out));
    }
}
