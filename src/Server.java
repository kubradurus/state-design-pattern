/**
 * @author Kübra VARICI
 */
public class Server {
    public int islemciSeviyesi;

    public ServerDurumu durum;

    public Server()
    {
        this.islemciSeviyesi = 50;
        serverIslemciSeviyesiKontrolEt();
    }

    public void serverIslemciSeviyesiKontrolEt()
    {
        if (this.islemciSeviyesi > 80)
            setDurum(new AsiriYukluDurum());
        else
            setDurum(new NormalDurum());
    }

    public void programKapat(int programUsageCPU)
    {
        this.islemciSeviyesi -= programUsageCPU;
    }

    public void programEkle(int programUsageCPU)
    {
        this.islemciSeviyesi += programUsageCPU;
        serverIslemciSeviyesiKontrolEt();
    }

    public int getIslemciSeviyesi() {
        return islemciSeviyesi;
    }

    public void setIslemciSeviyesi(int islemciSeviyesi) {
        this.islemciSeviyesi = islemciSeviyesi;
    }

    public void setDurum(ServerDurumu durum) {
        this.durum = durum;
        durum.durumKontrolEt(this);
    }
}
