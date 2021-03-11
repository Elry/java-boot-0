package com.rmt.DIP;

public class PersonRepository {
  private DBConn dbConn;

  public void personRepository(DBConn dbConn){
    this.dbConn = dbConn;
  }

  public void savePerson(Person person){
    
  }
}
