package Multiplayer_Network.Server;

import Multiplayer_Network.packets.AddPlayerPacket;
import Multiplayer_Network.packets.RemovePlayerPacket;
import Multiplayer_Network.packets.net_player;

public class event_listener {

    public void received(Object p) {
        if(p instanceof AddPlayerPacket) {
            AddPlayerPacket packet = (AddPlayerPacket)p;
            player_handler.players.put(packet.id, new net_player(packet.id, packet.packetName));
            System.out.println(packet.packetName + " has joined the game!");
        } else if(p instanceof RemovePlayerPacket) {
            RemovePlayerPacket packet = (RemovePlayerPacket)p;
            System.out.println(player_handler.players.get(packet.id2).netName);
            player_handler.players.remove(packet.id2);
        }
    }
}
