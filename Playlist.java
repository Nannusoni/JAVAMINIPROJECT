import java.util.ArrayList;
//project :Desert Island Playlist
class Playlist {
  
  public static void main(String[] args) {
  ArrayList<String> desertIslandPlaylist =  new ArrayList<String>();

  // adding songs to playlist 
  desertIslandPlaylist.add("Radhe-Krishna");
  desertIslandPlaylist.add("Radha-Ram");
  desertIslandPlaylist.add("jay Shriram");
  desertIslandPlaylist.add("Radha-Ranchi");
  desertIslandPlaylist.add("Radha-Mohan"); 
  desertIslandPlaylist.add("O Palan hare"); 
  System.out.println(desertIslandPlaylist);
  System.out.println(desertIslandPlaylist.size());
  desertIslandPlaylist.remove("O Palan hare"); 
  System.out.println(desertIslandPlaylist.size());
  System.out.println(desertIslandPlaylist);

  //choosing song index no. to swap
  int indexA = desertIslandPlaylist.indexOf("Radha-Ram");
  int indexB = desertIslandPlaylist.indexOf("Radha-Mohan");
//Create a new String variable called tempA and initialize it with the value of song a.
  String tempA = "Radha-Ram";

  //song swap

  desertIslandPlaylist.set(indexA,"Radha-Mohan"); 
   desertIslandPlaylist.set(indexB,"Radha-Ram"); 
  System.out.println(desertIslandPlaylist);
  }
  
}