package com.company;


import java.util.IdentityHashMap;

//מיצגת גלי תנועה
/*
class MotionSenor {
    private MotionSenor listener;

    public void setListener(MotionSenor listener) {
        this.listener = listener;
    }

    public MotionSenor getListener() {

        return listener;
    }


    public MotionSenor(MotionSenor listener) {

        this.listener = listener;
    }
        interface MotionListener{
        void motionDetected(int sensorId);
        }
}
*/
class MotionSenor {
    private MotionSenor[] listeners;
    int size;

    public void setListener(MotionSenor listener) {
        if (listener==null)
            return ;
        if(size<this.listeners.length)
        this.listeners[size++] = listener;
    }

    public MotionSenor(){
    listeners=new MotionSenor[10];
        size=0;
    }
    void detectMoition(){
        for (int i = 0; i < size; i++) {
            this.listeners[i].detectMoition();
        }

    }
    /*public MotionSenor(MotionSenor listener) {

        this.listener = listener;
    }*/


    interface MotionListener{
        void motionDetected(int sensorId);
    }
}
  class Siren implements MotionSenor.MotionListener{

      @Override
      public void motionDetected(int sensorId) {
          System.out.println("alarm"+sensorId);
      }
}


  class View {

  }
//שיוצר אוביקט מסוג בטן הפוניטר
  class Button extends View {
      private OnClickListener listener;

      public void setListener(OnClickListener listener) {
          this.listener = listener;
      }
//האם משו יצר אוביקט ?
      void detectedClick() {
          if (listener != null)
              listener.onClick(this);
      }
//אם כן אני יפעיל את הפונקציה
      interface OnClickListener {
          void onClick(View view);
      }
  }
class Police implements MotionSenor.MotionListener {
    @Override
    public void motionDetected(int sensorId) {


    }
}
