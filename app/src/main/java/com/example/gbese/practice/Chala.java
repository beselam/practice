package com.example.gbese.practice;

public class Chala {
  private int  counter ;

  public Chala(){
      this.counter=0;
  }

    public void incriment() {
      if (this.counter<10) {
          this.counter++;
      }
    }
    public void decriment(){
      if(this.counter>-10) {
          this.counter--;
      }
    }
    public void recet(){
      this.counter=0;
    }
    public int getvalue(){
      return this.counter;
    }
}
