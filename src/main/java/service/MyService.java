package service;

import store.MemoryStore;

import java.util.Collection;

public class MyService {

    private MemoryStore memoryStore = MemoryStore.instOf();

    public void save(String string) {
        memoryStore.save(string);
    }

    public Collection<String> getAll() {
        return memoryStore.getAll();
    }
}
