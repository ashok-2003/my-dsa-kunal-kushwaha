import java.util.*;

public class hashcode_73 {
    // so now here we will learn about the hashcode here
    public static void main(String[] args) {
        int a = 9898989;
        String str = "ashok";
        Integer aa = 456436743;
//        System.out.println(a.hashcode());  // so this is giving error here
        System.out.println(str.hashCode());
        System.out.println(aa.hashCode());  // same value as of the Integer here

    }
    // here is the link of the documentation here read it and learn about it
//    https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
    // so now here is the hashmap of the inbuilt java here
}
class has{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // so now here we will at in that
        map.put("ashok" , 85);
        map.put("amrit" , 90);
        map.put("ritik" , 83);
        map.put("siddant" , 78);
        // so now as here all the elment have been puted here
        System.out.println(map.get("ashok"));
        System.out.println(map.getOrDefault("ayush" , 67));
        // so ayush is not present in the map but by using the defalut here we can use this
        System.out.println(map.get("raj")); // return null if map value is not present thier
        System.out.println(map.containsKey("raj")); // return boolean true or false here
        System.out.println(map.containsValue(78));
        System.out.println(map.replace("ashok" , 88));
        System.out.println(map);

        // so now thier is simalary hasset function in which value don repeate
        Set<Integer> se = new HashSet<>();
        se.add(78);
        se.add(88);
        se.add(78);
        se.add(88);
        System.out.println(se); // as we can see it only print the 78 and 88 only one of the time here

    }
}
// so now here we will write out own hasmap code built by us
class mapusinghas<K,V>{
    public static void main(String[] args) {
        // so now here creating the program
        mapusinghas<String , Integer> hass = new mapusinghas<>();
        // so now here
        hass.put("ashok" , 85);
        hass.put("amrit" , 90);
        hass.put("ritik" , 83);
        hass.put("siddant" , 78);
        System.out.println(hass);

    }
    // so it would be the chanin based impletation here  so we will use the linked list with the array
    // so now here cerating the calss entitiy which takt the value of generic we want
    private class Entity{
        K key ;
        V values;
        public Entity(K key , V values){
            this.key = key;
            this.values = values;
        }
    }
    // so now we have to creating the
    private ArrayList<LinkedList<Entity>> list;
    // so now as the list has been created of the entity in the list of the linked list type of the entity
    private  int size = 0;
    private float lf = 0.5f;
    // so now we have to create the constructor of the main funcion
    public mapusinghas(){
        // so now as the arraylist have initaly size of 10
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<Entity>());
        }
        // so now list has been added here
    }
    // so now we are now using the put
    public void put(K key , V value){
        // so now we have to put the value so we want the hash code we want
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entity = list.get(hash);
        for (Entity ent : entity){
            if(ent.key.equals(key)){
                ent.values = value;
                return;
            }
        }
        //  so now for the amortized 1 constant so we need
        if((float)size/list.size() > lf){
            // so we have to rehas it
            rehash();
        }
        // so now adding agian
        entity.add(new Entity( key , value));
        size++;
    }

    private void rehash() {
        System.out.println("here we are rehashing");
        // so now here we are creating the rehash
        ArrayList<LinkedList<Entity>> oldlist = list;
        // so now it have been created so now we are
        // so now making the list new
        list = new ArrayList<>();
        // so now making the size zero
        size = 0;
        // so now
        for (int i = 0; i < oldlist.size()*2; i++){
            list.add(new LinkedList<>());
        }
        // so now updatign the previouse values in this list
        for(LinkedList<Entity> entries : oldlist){
            for(Entity entry:entries){
                put(entry.key , entry.values);
            }
        }
        // so now it has been added to the list here
    }
    public V get(K key){
        // so now if get the key
        // so getting the hash code first
        int has = Math.abs(key.hashCode()%list.size());
        // so now
        LinkedList<Entity> entities  = list.get(has);
        // so now in the linkedlist
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.values;
            }
        }
        return null;
    }

    public void remove(K key){
        // so now what if we want to remove a key so for that
        // so now here chek for the hascode first
        int has = Math.abs(key.hashCode()%list.size());
        // so now seraching for the linked list
        LinkedList<Entity> entities= list.get(has);
        // so now
        Entity target = null;
        // so we would direclty return this
        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                // so now it value become null
                // now break
                break;
            }
        }
        // so now also reduce the size
        size--;
    }
    // so now override method for printing
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entity> entities : list) {
            for(Entity entity : entities) {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.values);
                builder.append(" , ");
            }
        }
        builder.append("}");

        return builder.toString();
    }
}
