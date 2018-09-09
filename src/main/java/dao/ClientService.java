package dao;

import entity.Client;
import entity.ClientAddress;

public class ClientService {

    private ClientDAO clientDAO = new ClientDAO();

    private ClientAddressDAO clientAddressDAO = new ClientAddressDAO();

    public void addClient(Client client) {
            clientDAO.create(client);
    }

    public void addClientAddress(ClientAddress clientAddress) {
        clientAddressDAO.create(clientAddress);
    }

    public void addClientWithAddress(Client client) {
        clientAddressDAO.create(client.getClientAddress());
        clientDAO.create(client);
    }
}
