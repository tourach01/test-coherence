import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.net.Session;
import com.tangosol.net.SocketProviderFactory;
import com.tangosol.net.SocketProvider;

public class CoherenceExtendClient {
    public static void main(String[] args) {
        // Configuration du client
        System.setProperty("coherence.cacheconfig", "path/to/client-config.xml");

        // Création d'une session de client
        Session session = CacheFactory.ensureCluster().ensureSession();

        // Obtention d'un cache à partir de la session
        NamedCache<Object, Object> cache = session.getCache("my-cache");

        // Utilisation du cache
        cache.put("key", "value");
        Object value = cache.get("key");

        // Fermeture de la session et libération des ressources
        session.close();
    }
}
