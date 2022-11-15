package pl.dmuszynski.deliverycompany.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PacketGenerator {
    public Packet getRandomPacket(long idPacket) {
        int randomHeight = new Random().nextInt(300);
        int randomWidth = new Random().nextInt(200);
        int randomWeight = new Random().nextInt(50);
        int randomDepth = new Random().nextInt(30);
        return new Packet(idPacket, randomHeight, randomWidth, randomWeight, randomDepth);
    }

    public List<Packet> getRandomPacketList(int packetQuantity) {
        final List<Packet> randomPacketList = new ArrayList<>();
        for(int i = 0; i < packetQuantity; ++i)
            randomPacketList.add(this.getRandomPacket(i));
        return randomPacketList;
    }
}

class Packet{
    private final long idPacket;
    private final int height;
    private final int width;
    private final int weight;
    private final int depth;

    public Packet(long idPacket, int height, int width, int weight, int depth) {
        this.idPacket = idPacket;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.depth = depth;
    }

    public long getIdPacket() {
        return idPacket;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "idPacket=" + idPacket +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", depth=" + depth +
                '}';
    }
}
