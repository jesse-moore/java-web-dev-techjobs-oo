package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.techjobs_oo.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job2.getId() == job1.getId() + 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobSetsAllFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue((Integer)jobSetsAllFields.getId() instanceof Integer);
        assertTrue(jobSetsAllFields.getName() instanceof String);
        assertTrue(jobSetsAllFields.getEmployer() instanceof Employer);
        assertTrue(jobSetsAllFields.getLocation() instanceof Location);
        assertTrue(jobSetsAllFields.getPositionType() instanceof PositionType);
        assertTrue(jobSetsAllFields.getCoreCompetency() instanceof CoreCompetency);

        assertTrue(jobSetsAllFields.getId() > 0);
        assertEquals("Product tester", jobSetsAllFields.getName());
        assertEquals("ACME", jobSetsAllFields.getEmployer().getValue());
        assertEquals("Desert", jobSetsAllFields.getLocation().getValue());
        assertEquals("Quality control", jobSetsAllFields.getPositionType().getValue());
        assertEquals("Persistence", jobSetsAllFields.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testJobStringBeginsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        assertTrue(jobString.startsWith("\n"));
        assertTrue(jobString.endsWith("\n"));
    }

    @Test
    public void testJobStringSecondLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("ID: " + job.getId(), jobStringArr[1]);
    }

    @Test
    public void testJobStringThirdLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Name: " + job.getName(), jobStringArr[2]);
    }

    @Test
    public void testJobStringForthLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Employer: " + job.getEmployer(), jobStringArr[3]);
    }

    @Test
    public void testJobStringFifthLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Location: " + job.getLocation(), jobStringArr[4]);
    }

    @Test
    public void testJobStringSixthLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Position Type: " + job.getPositionType(), jobStringArr[5]);
    }

    @Test
    public void testJobStringSeventhLineIsCorrect(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Core Competency: " + job.getCoreCompetency(), jobStringArr[6]);
    }

    @Test
    public void testJobStringWhenFieldIsEmptyIsCorrect(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Name: Data not available", jobStringArr[2]);
        assertEquals("Employer: Data not available", jobStringArr[3]);
        assertEquals("Location: Data not available", jobStringArr[4]);
        assertEquals("Position Type: Data not available", jobStringArr[5]);
        assertEquals("Core Competency: Data not available", jobStringArr[6]);
    }

    @Test
    public void testJobStringWhenFieldValueIsNull(){
        Job job = new Job(null, new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");
        assertEquals("Name: Data not available", jobStringArr[2]);
        assertEquals("Employer: Data not available", jobStringArr[3]);
        assertEquals("Location: Data not available", jobStringArr[4]);
        assertEquals("Position Type: Data not available", jobStringArr[5]);
        assertEquals("Core Competency: Data not available", jobStringArr[6]);
    }

    @Test
    public void testJobStringWhenOnlyIdIsSet(){
        Job job = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job.toString());
    }
}
