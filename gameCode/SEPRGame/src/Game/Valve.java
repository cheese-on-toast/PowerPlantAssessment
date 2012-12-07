package Game;

import java.io.Serializable;

public class Valve implements Serializable {
    public boolean opened;
    public int valveID;

    public void open()
    //do we need validation here? to make sure it is closed before we open it
    {
        opened = true;
    }

    public void close()
    //do we need validation here? to make sure it is open before we close it
    {
        opened = false;
    }

    //#####################Set Methods START#####################
    public void setOpened(boolean o){opened = o;}
    public void setID(int id){valveID=id;}
    //#####################Set Methods END#####################

    //#####################Get Methods START#####################
    public boolean getOpened(){return opened;}
    public int getID(){return valveID;}
    //#####################Get Methods END#####################

}

