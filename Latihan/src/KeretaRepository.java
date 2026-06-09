//DIP DAN OCP
import java.util.List;

public interface KeretaRepository {
    List<KeretaApi> AllKereta();
    KeretaApi cariKode(String kodeKereta);
    void updateKereta(KeretaApi kereta);
}