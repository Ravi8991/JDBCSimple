package com.ravi;

class Toodle<T>
{
 
 T obj;
 Toodle(T obj) { this.obj = obj; }
 public T get() { return this.obj; }
}

class Hello
{
 public static void main (String[] args)
 {
  Toodle <Integer> i = new Toodle<Integer>(21);
  System.out.println(i.get());

  Toodle <String> t =
      new Toodle<String>("Hello Toodle");
  System.out.println(t.get());
 }
}