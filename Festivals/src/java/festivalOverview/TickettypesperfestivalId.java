package festivalOverview;
// Generated 21-apr-2013 16:18:54 by Hibernate Tools 3.2.1.GA



/**
 * TickettypesperfestivalId generated by hbm2java
 */
public class TickettypesperfestivalId  implements java.io.Serializable {


     private int festId;
     private int typId;

    public TickettypesperfestivalId() {
    }

    public TickettypesperfestivalId(int festId, int typId) {
       this.festId = festId;
       this.typId = typId;
    }
   
    public int getFestId() {
        return this.festId;
    }
    
    public void setFestId(int festId) {
        this.festId = festId;
    }
    public int getTypId() {
        return this.typId;
    }
    
    public void setTypId(int typId) {
        this.typId = typId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TickettypesperfestivalId) ) return false;
		 TickettypesperfestivalId castOther = ( TickettypesperfestivalId ) other; 
         
		 return (this.getFestId()==castOther.getFestId())
 && (this.getTypId()==castOther.getTypId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFestId();
         result = 37 * result + this.getTypId();
         return result;
   }   


}


