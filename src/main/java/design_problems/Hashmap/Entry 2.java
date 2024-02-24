package design_problems.Hashmap;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Entry<Key,Value>{
    Key key;
    Value value;
    Entry next;
    Entry(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}

