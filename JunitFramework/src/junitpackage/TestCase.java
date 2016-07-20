package junitpackage;

//import static org.junit.Assert.*;

//import org.junit.Test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCase {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(SetUp.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}


