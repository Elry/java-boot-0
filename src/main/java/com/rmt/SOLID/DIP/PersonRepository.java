package com.rmt.SOLID.DIP;

public class PersonRepository {
  private DBConn dbConn;

  public void personRepository(DBConn dbConn){
    this.dbConn = dbConn;
  }

  public void savePerson(Person person){
    System.out.println(dbConn);
  }
}
