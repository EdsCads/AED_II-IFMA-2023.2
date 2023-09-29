package com.atividades.eduardocadilhe.atv04_tabelahash.Questao_1;
/*
 * @author Cadilhe
 */
import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K,V> {
    public class HashObject{
        public K key;
        public V value;

        public HashObject(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<HashObject> keyValuePairs;

    public MyHashMap() {
        keyValuePairs = new ArrayList<>();
    }

    public void Put(K key, V value) {
        HashObject existing = Contains(key);
        if (existing == null) {
            keyValuePairs.add(new HashObject(key, value));
            return;
        }
        existing.value = value;
    }

    public V Get(K key) {
        HashObject existing = Contains(key);
        if(existing==null)
            return null;
        else
            return existing.value ;
    }

    public void Remove(K key) {
        HashObject existing = Contains(key);
        if (existing != null) {
            keyValuePairs.remove(existing);
        }
    }

    private HashObject Contains(K key) {
        for (HashObject kvp : keyValuePairs) {
            if (kvp.key == key) {
                return kvp;
            }
        }
        return null;
    }
}
