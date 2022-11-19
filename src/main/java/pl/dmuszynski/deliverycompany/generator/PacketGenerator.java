package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Packet;

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

