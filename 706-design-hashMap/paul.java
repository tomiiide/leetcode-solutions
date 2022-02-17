class MyHashMap {
    
    private LinkedList[] store;

    public MyHashMap() {
        this.store = new LinkedList[(int) Math.pow(10,4)];
    }
    
    private int hash(int key) {
        return key % store.length;
    }
    
    public void put(int key, int value) {
        int hashKey = hash(key);
        LinkedList list = store[hashKey];
        if(list == null) {
            LinkedList<Node> li = new LinkedList<>();
            li.add(new Node(key, value));
            store[hashKey] = li;
        } else {
            int index = findKeyIndex(key);
            if(index == -1) {
                list.add(new Node(key, value));
            } else {
                Node node = (Node) list.get(index);
                node.value = value;
            }
        }
    }
    
    public int get(int key) {
        LinkedList list = store[hash(key)];
        if(list == null) return -1;
        
        for(Object item : list) {
            Node node = (Node) item;
            if(node.key == key) {
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = findKeyIndex(key);
        if(index == -1) return;
        LinkedList list = store[hash(key)];
        list.remove(index);
    }
    
    private int findKeyIndex(int key) {
        LinkedList list = store[hash(key)];
        if(list == null || list.isEmpty()) return -1;
        
        int index = 0;
        boolean found = false;
        
        for(; index < list.size(); index++) {
            Node node = (Node) list.get(index);
            if(node.key == key) {
                found = true;
                break;
            }
        }
        return (found) ? index : -1;
    }
    
    public static class Node {
        final int key;
        int value;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
