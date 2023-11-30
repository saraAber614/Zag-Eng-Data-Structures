public class DynamicArray {

    int[] items;
    int size=0;
    int count=0;
    public DynamicArray(int x){
        size=x;
        items=new int[size];

    }
    public DynamicArray(){
        size=30;
        items=new int[size];
    }
    public void print_Array(){
        for(int i=0;i<count;i++)
            System.out.print(items[i]+"  ");
    }
    public void insert(int n){
        if(count==size){
            size=size*2;
            int[] newArray=new int[size];
            for(int i=0; i<count; i++)
                newArray[i]=items[i];
            items=newArray;
        }
        items[count]=n;
        count++;

    }
    public void removeAt(int index){
       if(index<0 || index>count-1)
           throw new IllegalStateException("Not valid");

       for(int i=index;i<count-1;i++)
           items[i]=items[i+1];
       count--;
    }
    public int indexOf(int item){
        for(int i=0;i<count;i++)
            if(item == items[i])
               return i;
      return -1;
    }

    public int max(){
       int max = items[0];
        for(int i=1; i<count;i++)
            if (items[i]>max)
                max=items[i];
          return max;
    }

    public int min(){
        int min = items[0];
        for(int i=1; i<count;i++)
            if (items[i]<min)
                min=items[i];
        return min;
    }


    public void remove(int item){
        int index=indexOf(item);
        if(index !=-1)
            removeAt(index);
    }

}
