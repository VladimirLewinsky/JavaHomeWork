import java.util.HashMap;

public class h6 {
    
    public static void main(String[] args) {
        Myset myset = new Myset();
        myset.add(1);
        myset.add(40);
        myset.add(80);
        myset.add(100);
        myset.add(37);
        System.out.println(myset); // println автоматически вызывает toString;
        
        for (int i = 0; i < myset.size(); i++) {
            
            System.out.println(myset.get(i));
        }
    }
    

    }
    class Myset{
        private HashMap<Integer,Object> map = new HashMap<>();
        private final Object OBJ = new Object();

        @Override
        public String toString(){
            return map.keySet().toString();
        }

        public boolean add(Integer i){
            map.put(i,OBJ);
            
            return true;
        }
        public Integer size(){
            return map.keySet().size();
        }
        public Integer get(Integer a){
            return (Integer) map.keySet().toArray()[a];
        }


}
