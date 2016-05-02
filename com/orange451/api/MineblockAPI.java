import com.orange451.game.mainGame;

/** 
* @author AppleBabies
*This is the main API for Mineblock 2D. From this class, you can access a limited amount of resources within the game, such as the level
*and materials and such. Some things will NOT be presented to you - this is for the safety of the game and of the people who play it.
*/
public class MineblockAPI
{

      private List<?> classes = new ArrayList<>();
      private String author;
      private String modName;
      private String modVersion;

      /**API grabber. Requires the following strings: author, mod name, and version of the mod*/
      public MineblockAPI(String author, String modName, String modVersion)
      {
         this.author = author;
         this.modName = modName;
         this.modVersion = modVersion;
         
         setupMod();
      }
      
      public void addClassToDirectory(Class class)
      {
          if(!classes.contains(class))
          {
            classes.add(class);
          }
      }

      private void setupMod()
      {
      
      mainGame game = new mainGame();
      if(!Main.isApplet())
      {
        game.getFrame().setTitle("Mineblock 2D Modded: " + modName + " " + modVersion);
        game.getFrame().setGameVersionInfo("Mineblock 2D Modded: " + modName + " " + modVersion);
      }
      
      }

}