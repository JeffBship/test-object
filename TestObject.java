//Jeff Blankenship
//CS-151
//TestObject provides user created objects for
//parameter passing demonstrations.

public class TestObject{
  
  //instance variable
  String data;
  
  //constructor
  public TestObject(){
    this.data = new String("ThisIsTheDefaultData");
  }
  
  //provide access to outside classes
  public String getData(){
    return this.data;
  }
  
  //allow outside classes to update data
  public void setData(String newData){
    //basic error handling...null values are skipped
    if (newData == null){ 
      //do nothing, skipping the null data
    } else {
      //update data
      this.data = newData;
    }
  }
  
}







