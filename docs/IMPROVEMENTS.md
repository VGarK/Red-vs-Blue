->Stage.java, line 152 // SelectingNewLocation.java, line 55

I added a "Done" button when an actor has finished its movement, next to the "Fire" button. Having to choose one cell after selecting the actor becomes a hassle when the player has to repeat the same action as the game advances. Not only that, but the player may not want to act even if there are no targets nearby or in range.

As a result, after the change, the game is more userfriendly and can progress quicker, making the player more engaged.  


->Stage.java, line 51. 

I changed the color of the action cells (the cells that the actor can move/fire into) from blue [0f, 0f, 1f, 0.5f] to black [0f, 0f, 0f, 0.8f]. I also changed the alpha, so the colour stands out against the alternative cells.

Thus, making the game experience for the player smoother and less strenuous for the players´ eyes. 


->MenuItem.java, line 21.

I changed the colour of the menu font from black [0f, 0f, 0f, 1.0f] to red [1f, 0f, 0f, 1.0f]. This impacts the immersion within the game as the player can visually see the team they are participating in. Furthermore, future updates of the game could allow competition not only between the player and the computer, but between two (and maybe more) human players. 

This colour change would allow a clear difference between all the players participating in the game. 