/**
 * @author Kübra VARICI
 */
public class NormalDurum extends ServerDurumu{

    @Override
    public void durumKontrolEt(Server server) {
        System.out.println("Server işlemci seviyesi : " + server.getIslemciSeviyesi() + " Server durumu normal.");
    }
}
