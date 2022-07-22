package store;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MemoryStore {

    private static final MemoryStore INST = new MemoryStore();
    private final Map<Integer, String> strings = new ConcurrentHashMap<>();
    private final AtomicInteger stringId = new AtomicInteger();

    private MemoryStore() {
        save("Hello");
        save("It's my app");
    }

    public static MemoryStore instOf() {
        return INST;
    }

    public void save(String string) {
        strings.put(stringId.incrementAndGet(), string);
    }

    public Collection<String> getAll() {
        return strings.values();
    }
}
