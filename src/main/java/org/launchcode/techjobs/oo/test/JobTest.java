package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job test_job;
    Job test_job1;
    @Before
    public void createJobObject() {
        //        Car test_car = new Car("Toyota", "Prius", 10, 50);
        test_job= new Job("Junior", new Employer("HFJFDHF"), new Location("Dfdjdm"), new PositionType("Dbjdhjdhf control"), new CoreCompetency("Dhfjbnb"));
    }
    @Before
    public void createJobObject1() {
        test_job1= new Job("Junior", new Employer("GJFJVF"), new Location("Djfvjd"), new PositionType("GJFDvkfv control"), new CoreCompetency("HJYTGvfvd"));
    }
    @Before
    public void emptyConstructor(){}
    //testing default constructor
            //    Test the Empty Constructor
    @Test
    public void testSettingJobId(){
        assertFalse(test_job.getId()== test_job1.getId());
    }

    //Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertTrue(objectName instanceof ClassName)
        assertTrue(test_job2 instanceof Job);
    }

//    Test the equals Method


    @Test
    public void testJobsForEquality(){
        Job test_job3 =  new Job( "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 =  new Job( "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job3.equals(test_job4));
    }

    // 5) Use TDD to Build The toString Method

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char firstChar = test_job.toString().charAt(0);
        char lastChar = test_job.toString().charAt(test_job.toString().length()-1);
        assertEquals( firstChar, '\n');
        assertEquals(lastChar,'\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String output = String.format(
                "\nID: %d\n" +
                "Name: %s\n"+
                "Employer: %s\n"+
                "Location: %s\n"+
                "Position Type: %s\n"+
                "Core Competency: %s\n",
                test_job.getId(),
                test_job.getName(),
                test_job.getEmployer(),
                test_job.getLocation(),
                test_job.getPositionType(),
                test_job.getCoreCompetency());

        assertEquals(output, test_job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job= new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       String output = "";
         output = String.format(
                "\nID: %d\n" +
                        "Name: Data not available%s\n"+
                        "Employer: %s\n"+
                        "Location: %s\n"+
                        "Position Type: %s\n"+
                        "Core Competency: %s\n",
                test_job.getId(),
                test_job.getName(),
                test_job.getEmployer(),
                test_job.getLocation(),
                test_job.getPositionType(),
                test_job.getCoreCompetency());

        assertEquals(output, test_job.toString());

    }




}
