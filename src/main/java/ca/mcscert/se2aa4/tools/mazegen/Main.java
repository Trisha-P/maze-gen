package ca.mcscert.se2aa4.tools.mazegen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Here goes the business code");
        Configuration config = new Configuration(args);
        Random random = buildReproducibleGenerator(config.seed());
        Maze theMaze = new Maze(config.width(), config.height());
        theMaze.carve(random);
        MazeExporter exporter = new MazeExporter(theMaze);
        exporter.export(config.outputFile());
    }

    private static Random buildReproducibleGenerator(long seed) {
        Random generator = new Random();
        generator.setSeed(seed);
        return generator;
    }
}
