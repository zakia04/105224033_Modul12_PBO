//SRP
import java.util.ArrayList;
import java.util.List;

public class PenyimpananDataKereta implements KeretaRepository {
    private List<KeretaApi> daftar = new ArrayList<>();
    public PenyimpananDataKereta() {
        daftar.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftar.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }
    @Override
    public List<KeretaApi> AllKereta() {
        return daftar;
    }
    @Override
    public KeretaApi cariKode(String kodeKereta) {
        for (KeretaApi k : daftar) {
            if (k.kodeKereta.equals(kodeKereta)) {
                return k;
            }
        }
        return null;
    }
    @Override
    public void updateKereta(KeretaApi kereta) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).kodeKereta.equals(kereta.kodeKereta)) {
                daftar.set(i, kereta);
                return;
            }
        }
    }
}