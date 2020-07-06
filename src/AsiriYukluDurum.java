/**
 * @author Kübra VARICI
 */
public class AsiriYukluDurum extends ServerDurumu{
    @Override
    public void durumKontrolEt(Server server) {
        System.out.println("Server işlemci seviyesi : " + server.getIslemciSeviyesi() +
                " Server aşırı yüklenmiş. Bazı programlar kapatılıyor.");

        server.programKapat(10);

        if (server.islemciSeviyesi > 80)
            server.setDurum(new AsiriYukluDurum());
        else
            server.setDurum(new NormalDurum());
    }
}
