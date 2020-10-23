package com.makerzip.version;

import java.net.URL;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args)
   {
   try {
      final String myVersion = "1.0";         //버전을 설정하는 곳
      URL url = new URL("http://gbot.version.kro.kr");
      BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
      String version;
      
      while ((version = in.readLine()) != null)
         switch (version) {
         case myVersion:
            System.out.println("현재 최신버전입니다.");
            break;
         default:
            System.out.println("새로운 버젼이 검색 되었습니다.");
            break;
         } 
      } catch (IOException e) {
         System.out.println("버전을 검색하지 못했습니다.");
      }
   }
}