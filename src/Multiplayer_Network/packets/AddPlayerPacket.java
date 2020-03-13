package Multiplayer_Network.packets;

import java.io.Serializable;

public class AddPlayerPacket implements Serializable {

    private static final long serialVersionUID = 1l;
    public String packetName;
    public int id;
}
