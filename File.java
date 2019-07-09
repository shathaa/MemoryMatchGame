
package memorymatchgame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author a7taj_000
 */
public class File {

    public File(){
    
    }
    
     
 public void deleteReason( String username , String reason) {
        
        try {
            
            BufferedWriter out = new BufferedWriter(new FileWriter("Complaines.txt" , true ));
            out.write( username );
            out.write( "\n");
            out.write( reason );
            out.write( "\n");
            out.write( "\n");
            out.close();
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
