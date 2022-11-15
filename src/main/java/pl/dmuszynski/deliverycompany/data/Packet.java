package pl.dmuszynski.deliverycompany.data;

public class Packet {
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
