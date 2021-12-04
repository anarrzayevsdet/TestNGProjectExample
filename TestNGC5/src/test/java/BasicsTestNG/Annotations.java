package BasicsTestNG;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite executed"); }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test executed"); }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class executed"); }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before groups executed"); }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method executed"); }

    @Test()
    public void test(){ System.out.println("Test executed");}

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method executed"); }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After groups executed"); }

    @AfterClass
    public void afterClass(){
        System.out.println("After class executed"); }

    @AfterTest
    public void afterTest(){
        System.out.println("After test executed"); }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite executed");}











}
