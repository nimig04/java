// Manipulating ArrayLists to make, modify, and swap values in a playlist.
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Duality - Slipknot");
    desertIslandPlaylist.add("Doomsday Party - Sybreed");
    desertIslandPlaylist.add("The Only - Static-X");
    desertIslandPlaylist.add("Feel Good Inc. - Gorillaz");
    desertIslandPlaylist.add("The Business - Tiesto");
    desertIslandPlaylist.add("Shut Me Up - MSI");
    desertIslandPlaylist.remove(4);
    //System.out.println(desertIslandPlaylist);
    
    // size of playlist
    //System.out.println(desertIslandPlaylist.size());

    // Swap 'em
    int indexA = desertIslandPlaylist.indexOf("Duality - Slipknot");
    int indexB = desertIslandPlaylist.indexOf("Doomsday Party - Sybreed");
    // Create temp variable to store value of song a
    String tempA = "Duality - Slipknot";
    // Set indexA to new value
    desertIslandPlaylist.set(indexA, "Doomsday Party - Sybreed");
    // Set indexB to tempA value
    desertIslandPlaylist.set(indexB, tempA);

    System.out.println(desertIslandPlaylist);

  }
  
}
