package com.company;


public class MyString implements Comparable<MyString> {
      public final char[] myChar;

    public MyString(char[] myChar) {
        this.myChar = myChar;
    }

    public int indexOf(MyString myString){
        int index=0;
        for (int i = 0; i <myChar.length-myString.myChar.length; i++) {
            if (myChar[i]==myString.myChar[0]){
                index=i;
                for (int j = 0; j <myString.myChar.length;j++ ) {
                    if (!(myString.myChar[j]==myChar[i+j]))
                    break;
                }
                return index;
            }
        }
        return -1;
    }


    public MyString[] spilt(char c){
        MyString[] myString=new MyString[myChar.length];
        int index=0;
        int j=0;
        char[] temp=new char[myChar.length];
        //temp=null;
       // MyString myString2=new MyString(new char[' ']);
        for (int i = 0; i <myChar.length ; i++) {
            if(myChar[i]!=c)
               temp[j++]=myChar[i];
            if(myChar[i]==c) {
                myString[index] = new MyString(temp);
                index++;
                temp=new char[myChar.length];
                j=0;
            }
        }
        myString[index] = new MyString(temp);
        myString[index+1]=null;
        return myString;
    }

    @Override
    public int compareTo(MyString m) {
        int i = 0;
        if (m == null)
            return -1;
            while ((i < m.myChar.length) && (i < myChar.length)) {
            if (myChar[i] > m.myChar[i])
                return 1;
            if (myChar[i] < m.myChar[i])
                return  -1;
            if(m.myChar[i] == myChar[i])
                i++;
        }
        if (myChar.length > m.myChar.length)
              return  -1;
        if (myChar.length < m.myChar.length)
            return  1;
        return 0;
    }
//מגדולות לקטנות מקטנות לגדולות
    public void toUpper(MyString myString){
       char[] chars=new char[myString.myChar.length];
        for (int i = 0; i <myString.myChar.length ; i++) {
            if (myString.myChar[i] > 64 && myString.myChar[i] < 91 )
                myString.myChar[i]+=32;
            if (myString.myChar[i] > 96  && myString.myChar[i] < 123 )
                myString.myChar[i]-=32;

        }
        /*MyString m = new MyString(chars);
        return m;
        return new MyString(chars);*/
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        MyString m=(MyString)obj;
        return myChar.length==m.myChar.length && indexOf(m)==0;
    }


}
