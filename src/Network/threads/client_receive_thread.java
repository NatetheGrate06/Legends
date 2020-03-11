package Network.threads;

import java.rmi.registry.Registry;

public class client_receive_thread {

    private Registry registry;
    private game_controller gameController;
    protected client_send_thread clientSendThread;
}
