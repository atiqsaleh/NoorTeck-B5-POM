
  package com.noorteck.qa.runners;
  
  import org.junit.runner.RunWith; 
  import io.cucumber.junit.Cucumber;
  import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  
  @CucumberOptions( features = "src/test/resources/ntk/login.feature",
  glue = {"com.noorteck.qa.steps"}
 
 )
 
  public class LoginRunner {
 
  }
 
  
  
  //   src/test/resources/ntk/login.feature    this is path of feature file we dont past all path the resource package
  
  
  /**
   in our scenario we can have n- number of test steps 
   Given
   When 
   And
   Then
   Each step in our scenario has corresponding java methods in step definition class
   de we keep those step methods in the same class or can it be in t different step def class?
   the step methods can be in any step class
    
  */
  
  