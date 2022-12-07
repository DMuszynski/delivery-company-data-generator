package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Dimension;
import pl.dmuszynski.deliverycompany.data.Packet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PacketGenerator {
    private final DimensionGenerator dimensionGenerator = new DimensionGenerator();
    private final Random random = new Random();

    private final String[] packetType = {
            "Gabaryt A",    // maksymalne wymiary 8 × 38 × 64 cm, maksymalna waga: 25 kg
            "Gabaryt B",    // maksymalne wymiary 19 × 38 × 64 cm, maksymalna waga: 25 kg
            "Gabaryt C",    // maksymalne wymiary 41 × 38 × 64 cm, maksymalna waga: 25 kg
    };
    private final String[] wrappingType = {
            "Karton wykrojnikowy", "Karton klapowy", "Pudełko kartonowe", "Folia piankowa",
            "Karton z tektury", "Pudełko karbowane", "Karton podłużny", "Pudełko fasonowe",
            "Karton teleskopowy", "Pudełko z wiekiem", "Karton sztancowany"
    };

    public Packet getRandomPacket(long idPackage) {
        final String randomPacketType = packetType[random.nextInt(packetType.length)];
        final String randomWrappingType = wrappingType[random.nextInt(wrappingType.length)];
        final int randomWeight = random.nextInt(25);

        final Dimension dimension = switch (randomPacketType) {
            case "Gabaryt A" -> dimensionGenerator.getRandomDimension(8, 38, 64);
            case "Gabaryt B" -> dimensionGenerator.getRandomDimension(19, 38, 64);
            case "Gabaryt C" -> dimensionGenerator.getRandomDimension(41, 38, 64);
            default -> dimensionGenerator.getRandomDimension(0, 0, 0);
        };
        return new Packet(idPackage, randomPacketType, randomWrappingType, dimension, randomWeight);
    }

    public List<Packet> getRandomPacketList(int packetQuantity) {
        final List<Packet> randomPacketList = new ArrayList<>();
        for(int i = 0; i < packetQuantity; ++i)
            randomPacketList.add(this.getRandomPacket(i+1));
        return randomPacketList;
    }
}
