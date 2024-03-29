package designPatter.itrator;

public class NameRepository implements Container{

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator<Object> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<Object> {
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
