package festivalOverview;
// Generated 21-apr-2013 16:18:54 by Hibernate Tools 3.2.1.GA



/**
 * Tickettypesperfestival generated by hbm2java
 */
public class Tickettypesperfestival  implements java.io.Serializable {


     private TickettypesperfestivalId id;
     private Tickettypes tickettypes;
     private Festivals festivals;
     private int aantal;

    public Tickettypesperfestival() {
    }

    public Tickettypesperfestival(TickettypesperfestivalId id, Tickettypes tickettypes, Festivals festivals, int aantal) {
       this.id = id;
       this.tickettypes = tickettypes;
       this.festivals = festivals;
       this.aantal = aantal;
    }
   
    public TickettypesperfestivalId getId() {
        return this.id;
    }
    
    public void setId(TickettypesperfestivalId id) {
        this.id = id;
    }
    public Tickettypes getTickettypes() {
        return this.tickettypes;
    }
    
    public void setTickettypes(Tickettypes tickettypes) {
        this.tickettypes = tickettypes;
    }
    public Festivals getFestivals() {
        return this.festivals;
    }
    
    public void setFestivals(Festivals festivals) {
        this.festivals = festivals;
    }
    public int getAantal() {
        return this.aantal;
    }
    
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }




}


