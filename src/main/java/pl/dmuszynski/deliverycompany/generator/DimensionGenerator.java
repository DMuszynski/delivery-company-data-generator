package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Dimension;

import java.util.Random;

public class DimensionGenerator {
    public final Random random = new Random();

    public Dimension getRandomDimension(int maxLength, int maxWidth, int maxHeight) {
        int randomLength = this.random.nextInt(maxLength);
        int randomWidth = this.random.nextInt(maxWidth);
        int randomHeight = this.random.nextInt(maxHeight);

        return new Dimension(randomLength, randomWidth, randomHeight);
    }
}
