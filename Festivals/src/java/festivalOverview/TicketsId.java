package festivalOverview;
// Generated 21-apr-2013 15:06:18 by Hibernate Tools 3.2.1.GA



/**
 * TicketsId generated by hbm2java
 */
public class TicketsId  implements java.io.Serializable {


     private int festId;
     private int gebrId;

    public TicketsId() {
    }

    public TicketsId(int festId, int gebrId) {
       this.festId = festId;
       this.gebrId = gebrId;
    }
   
    public int getFestId() {
        return this.festId;
    }
    
    public void setFestId(int festId) {
        this.festId = festId;
    }
    public int getGebrId() {
        return this.gebrId;
    }
    
    public void setGebrId(int gebrId) {
        this.gebrId = gebrId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TicketsId) ) return false;
		 TicketsId castOther = ( TicketsId ) other; 
         
		 return (this.getFestId()==castOther.getFestId())
 && (this.getGebrId()==castOther.getGebrId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFestId();
         result = 37 * result + this.getGebrId();
         return result;
   }   


}


