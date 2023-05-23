import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class CoherenceLocalClient {
    public static void main(String[] args) {
        // Configuration du client
        System.setProperty("coherence.cacheconfig", "path/to/client-config.xml");

        // Obtention d'un cache local
        NamedCache<Object, Object> cache = CacheFactory.getCache("my-cache");

        // Utilisation du cache
        cache.put("key", "value");
        Object value = cache.get("key");

        // Fermeture du cache et libération des ressources
        cache.release();
    }
}
