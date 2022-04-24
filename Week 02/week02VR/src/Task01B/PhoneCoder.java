package Task01B;

public class PhoneCoder {

    private int key;

    public PhoneCoder(){
       this.key = -1;
    }

    public PhoneCoder(int key){
        setKey(key);
    }

    public double getKey(){
        return this.key;
    }

    public void setKey(int key){
        if( key > 0 && key < 10){
            this.key = key;
        }else{
            this.key = -1;
        }
    }

    public String encode(String phoneNumber){

        int number = Integer.parseInt(phoneNumber);
        String encodedNumber =  "";

        while(number > 0){
            int currNum = number % 10;
            number /= 10;

            currNum = (currNum + key) % 10;
            encodedNumber += String.valueOf(currNum);
        }

        for(int i = 0; i < encodedNumber.length()/2; i++){
            char temp = encodedNumber.charAt(i);
              //  encodedNumber.charAt(i) = encodedNumber.charAt(i + 2);
               // encodedNumber.charAt(i + 2) = temp;

        }

        return encodedNumber;
    }

}
