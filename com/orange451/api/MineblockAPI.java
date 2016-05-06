import com.orange451.game.mainGame;

/** 
* @author AppleBabies
*This is the main API for Mineblock 2D. From this class, you can access a limited amount of resources within the game, such as the level
*and materials and such. Some things will NOT be presented to you - this is for the safety of the game and of the people who play it.
*/
public class MineblockAPI
{

      private List<Class<?>> classes = new ArrayList<Class<?>>();
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
      
      private mainGame game()
      {
         return new mainGame(new CustomCanvas());
      }
      
      public PlayerController getPlayer()
      {
            return game().getPlayer();
      }
      
      public int getWorldId()
      {
            try{
            return getPlayer().getWorldId();
            catch(OutOfBoundsException e){
                  e.printStackTrace();
            }
      }

      public void addClassToDirectory(Class<?> class)
      {
          try{
          if(!classes.contains(class))
          {
            classes.add(class);
          }
          } catch (ClassNotFoundException ex){
                ex.printStackTrace();
          }
      }

      private void setupMod()
      {
      
      if(!Main.isApplet())
      {
        game().getFrame().setTitle("Mineblock 2D Modded: " + modName + " " + modVersion);
        game().getFrame().setGameVersionInfo("Mineblock 2D Modded: " + modName + " " + modVersion);
      }
      
      
      
      }
      
      class loadClasses implements ClassLoader
      {
            
            public loadClasses(Object object)
            {
                  super(object);
                  //TODO: Load the classes put in the script
            }
             
      }
      }

}
