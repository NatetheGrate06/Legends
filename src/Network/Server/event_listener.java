package Network.Server;

public class event_listener {

    public void received(Object p) {
        if(p instanceof AddPlayerPacket) {
            AddPlayerPacket packet = (AddPlayerPacket)p;
        }
    }
}
