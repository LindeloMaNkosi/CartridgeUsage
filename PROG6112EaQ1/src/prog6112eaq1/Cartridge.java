package prog6112eaq1;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Cartridge {
    
    private String printer;
    private String year;
    private int usage;
    
    public Cartridge(String printer, String year, int usage){
      this.printer = printer;
      this.year = year;
      this.usage = usage;
    }
    
     public Cartridge(Cartridge source){
        
        this.printer = source.printer;
        this.year = source.year;
        this.usage = source.usage;
    }
     
    public String getPrinter(){
        return this.printer;
    }
    
    public String getYear(){
        return this.year;
    }
    
    public int getUsage(){
        return this.usage;
    }
}
