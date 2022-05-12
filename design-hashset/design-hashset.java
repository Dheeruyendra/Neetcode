class MyHashSet {
    
    ArrayList<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        
        if(set.contains(key)){
            return;
        }
        set.add(key);
        
    }
    
    public void remove(int key) {
        
        if(set.contains(key)){
            set.remove(new Integer(key));
        }
        
        return;
        
    }
    
    public boolean contains(int key) {
        if(set.contains(key))return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */