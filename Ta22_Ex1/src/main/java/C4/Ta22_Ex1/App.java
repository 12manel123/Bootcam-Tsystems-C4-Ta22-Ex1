package C4.Ta22_Ex1;

import Controlador.ClienteController;
import Modelo.ClienteDAO;
import Vista.ClienteView;

public class App {
    public static void main(String[] args) {
        // Crear instancias de ClienteDAO, ClienteView y ClienteController
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteView clienteView = new ClienteView();
        ClienteController clienteController = new ClienteController(clienteDAO, clienteView);

        // Iniciar
        clienteController.iniciar();
    }
}
