public class Person {
      private String   name;
   
   
      public Person(String initialName) {
         this.name = initialName;
      }
   
      public Person() {}
   
      public void setName( String fullName) {
         this.name = fullName;
      }

      public String getName() {
         return this.name;
      }
 
      public String toString() {
         return this.name;
      }
}
