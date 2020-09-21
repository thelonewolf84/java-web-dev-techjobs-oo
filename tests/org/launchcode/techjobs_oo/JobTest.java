package org.launchcode.techjobs_oo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class JobTest {
    private static Job test_job;
    private static Job test_job2;

    @BeforeClass
    public static void createTestJobs(){
        test_job = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job.getId(), test_job2.getId(), 1);
    }

    @Test
    public void testStaringJobId() {
        System.out.println(test_job.getId());
        assertEquals(1, test_job.getId(), 0);
    }

    @Test
    public void testSettingSecondJobId() {
        assertEquals(2, test_job2.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job3 instanceof Job);
    }

    @Test
    public void testJobConstructorSetsName() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", test_job4.getName());
    }

    @Test
    public void testJobConstructorSetsEmployer() {
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ACME", test_job5.getEmployer().getValue());
    }

    @Test
    public void testJobConstructorSetsLocation() {
        Job test_job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Desert", test_job6.getLocation().getValue());
    }

    @Test
    public void testJobConstructorSetsPositionType() {
       Job test_job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Quality control", test_job7.getPositionType().getValue());
    }

    @Test
    public void testJobConstructorSetsCoreCompetency() {
        Job test_job8 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Persistence", test_job8.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job test_job9 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job test_job10 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job9.equals(test_job10));
    }
}