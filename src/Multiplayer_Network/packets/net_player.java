package Multiplayer_Network.packets;

public class net_player {

    public int netId;
    public String netName;

    public net_player(int id, String name) {
        this.netId = id;
        this.netName = name;
    }
}
