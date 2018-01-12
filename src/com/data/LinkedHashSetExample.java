package com.data;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {  
    public static void main(String[] args) {  
        LinkedHashSet<UserData> hs=new LinkedHashSet<UserData>();  
        //Creating UserDetails  
        UserData b1=new UserData(101,"John",823214,"This is First address");  
        UserData b2=new UserData(102,"Mike",13454,"Second Address");
        UserData b3=new UserData(103,"Joy",36454,"Test Case");
        
        //Adding Users to hash table  
        hs.add(b1);  
        hs.add(b2);  
        hs.add(b3);  
        //Traversing hash table  
        for(UserData b:hs){  
        System.out.println(b.id+" "+b.name+" "+b.phone+" "+b.address);  
        }  
    }  
    }  
