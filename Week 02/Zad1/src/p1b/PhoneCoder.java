package p1b;

public class PhoneCoder {
    private int key;

    public PhoneCoder(int key) {
       setKey(key);
    }
    public PhoneCoder(){
        this(1);
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        if(key> 0 && key < 10) {
            this.key = key;
        }
        else{
            this.key = 1;
        }
    }

    public String encode(String phoneNumber){
        int number = Integer.parseInt(phoneNumber);
        int digit4 = number % 10;
        digit4 = (digit4 + key) % 10;

        //TODO: for all digits

        return null;
    }

    public String decode(String codedPhoneNumber){
        return null;
    }

    @Override
    public String toString(){
        return String.format("Phone coder: /%d",  key);
    }


}
