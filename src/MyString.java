public class MyString {
    private char[] arr;
    int count = 0;

    public MyString(char[] chars) {
        arr = chars;
        count = arr.length;
    }

    public void add(char value){
       char[] temp = arr;
       arr = new char[temp.length+1];
       copy(temp);
       arr[count] = value;
       count++;
    }

    private void copy(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        count = temp.length;
    }

    public void addString(char[] addArr){
        for (int i = 0; i < addArr.length ; i++) {
             arr[count + i] = addArr[i];
        }
        count += addArr.length;
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
