package Stack;
//11. Implement k stack in an array
class Kstack{
    int arr[];int top[];int next[];
    int freeTop,k,cap;
    Kstack(int k1,int cap){
        k = k1;
        cap =cap;
        arr = new int[cap];
        top = new int[k];
        next =  new int[cap];
        for (int i = 0; i < cap - 1; i++) {
            next[i] =i+1;
        }
        next[cap-1] = -1;
        freeTop=0;
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
    }

    boolean isEmpty(int sn ){
        return (top[sn]==-1);
    }
    boolean isFull(){
        return (freeTop==-1);
    }

    public  void push(int x,int sn){
        if(isFull()){
            System.out.println("Stack OverFlow");
            return;
        }
        int i = freeTop;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i]=x;
    }
    public int pop(int sn){
        if (isEmpty(sn)){
            System.out.println("Stack UnderFlow");
            return Integer.MAX_VALUE;
        }
        int i = top[sn];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }
}
public class kStackINArray {

    public static void main(String[] args) {
        int k = 3, n = 10;
        Kstack ks=new Kstack(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2) );
        System.out.println("Popped element from stack 1 is " + ks.pop(1) );
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );

    }
}
