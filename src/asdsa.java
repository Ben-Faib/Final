 else if (myYVelocity > 0 && myXVelocity>0) {
            myYVelocity = -myYVelocity -.5;
            myXVelocity = -myXVelocity -.5;
        }
        else if (myYVelocity > 0 && myXVelocity < 0) {
            myYVelocity = -myYVelocity -.5;
            myXVelocity = -myXVelocity;
        }
    }
    
    if (getY()< -2) { 
        if(myYVelocity<0 && myXVelocity == 0) { 
            myYVelocity = -myYVelocity; 
        }
        else if (myYVelocity < 0 && myXVelocity>0) {
            myYVelocity = -myYVelocity;
            myXVelocity = -myXVelocity -.5;
        }
        else if (myYVelocity < 0 && myXVelocity < 0) {
            myYVelocity = -myYVelocity;
            myXVelocity = -myXVelocity;
        }
    }
    
     //  if (getX()> 500) {
        //  myXVelocity = -myXVelocity - .5;
     //   }
        
    //   if (getX()< -10) {
       //    myXVelocity = -myXVelocity + .5;
      //  }