public class Insertion{

    public void insert(int arr[], int n, int pos, int value){
        for(int i=n; i>pos; i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        n++;
    }

    public static void main(String[] args){
        int arr[10] = {1,2,3,4,5};
        int n=5;
        int pos=3,value=4;
        
        //Insert function call
        insert(arr,n,pos,value);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
    }
}

//  WRONG WRONG WRONG WRONG WRONG