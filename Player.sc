using UnityEngine;
using System.Collections;

class Player: monoBehaviour
{
    private int _x;
    private int _y;
    private int _velocity;

    public void Start()
    {
        // use this for the player initializations if needed.
    }

    public void Update()
    {
        // what happens with the player every tick goes here
        // such as movement

                if (Input.GetKey("space"))
                {
                // jump
                }
    }

    public int getX()
    {
        return _x;
    }
    
    public int getY())
    {
        return _y;
    }

    public int getVelocity()
    {
        return _velocity;
    }

    public void setX(int x)
    {
        _x = x;
    }

    public void setY(int y)
    {
        _y = y;
    }

    public int setVelocity(int v)
    {
        _velocity = v;
    }
}