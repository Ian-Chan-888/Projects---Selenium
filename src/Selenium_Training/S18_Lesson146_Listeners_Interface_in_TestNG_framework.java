package Selenium_Training;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class S18_Lesson146_Listeners_Interface_in_TestNG_framework implements ITestListener {
	/*
	 * In this lesson we will look at Frameworks: What is Framework? - A testing
	 * framework or more specifically a testing automation framework is an.
	 * execution environment for automated tests. It is the overall system in which
	 * tests will be automated. -
	 * 
	 * Technologies Description Example scenario ------------ ------------
	 * ---------------- 
	 * Phase 1: TestNG- Unit Testing framework run 400 tests 200
	 * run as smoke Data Driven Testing Best Practices to drive data from external
	 * resources Maven Build Management Tool Jenkins Continuous Integration Reports
	 * Reports for Framwork tests Log 4j Logging framework generates Logs Page
	 * object Mechanism Design Patterns for tests development
	 * 
	 * Phase 2: Framework Building Develop Robust Selenium framework from scratch
	 * real time project by integrating all the componenets of framework and run
	 * selenium tests
	 * *****************************************************************************
	 * *****************************************************************************
	 * ******************************* Test NG Tutorial
	 * 

	 * 		**********************************************************************		
	 * For running examples see:
	 * - S18_Lesson146_Listeners.java
	 * - S18_Lesson146_Test
	 * 
	 * TOPIC 1:
	 *  What are Listeners? 
	 *  -Listeners is a way of specifiying what to do next if a particular method fails, skipped...etc
	 *  
	 *  
	 *  uses: ITestListner
	 *  import org.testng.ITestListener;
	 *  
	 *  Syntax at class level: 
	 *  
	 *  'public class <name> implements ITestListner{..}'
	 *  
	 *  
	 *  There needs to be a specification in the xml to determmin where this Listeners class is located.
	 *   i.e: 
	 *   
	 *   <listeners>
	 *   	<listener class-name= <class name>/>
	 *   </listeners>
	 *  
	 *  
	 * 		**********************************************************************		
	 *  TOPIC 2:
	 *  
	 *  RUNNING TESTS IN PARALLEL
	 *  - if you want to trigger specific tests in parallel you use the parallel attribute
	 *  - note this can lead to performance and you may not need to implement parallel implements in TestNG.
	 *  
	 *  This is specified in the xml and the syntax can be implemented within the 'suite' : 
	 *  
	 *  <suite name = "test suite name 1" parallel = "test suite name 2" thread-count="2">
	 *  
	 *  
	 *  		**********************************************************************	
	 *  
	 *  REPORTS: 
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 */
	




	
	}


