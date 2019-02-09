using UnityEngine;
using System.Collections;

public class MainMenu: monoBehaviour
{
    void Start()
    {
        // use this for MainMenu initializations if needed.
    }

    void Update()
    {
        // what happens with the MainMenu every tick goes here

        if (Input.GetKey("p"))
        {
            // play game
        }
        else if (Input.GetKey("o"))
        {
            // options
        }
        else if (Input.GetKey("q"))
        {
            // quit game
        }
    }
}
