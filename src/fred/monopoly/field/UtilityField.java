/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Dice;
import fred.monopoly.Player;

/**
 *
 * @author fsr19
 */
public class UtilityField extends OwnebleField {
    
    Dice dice;
    
    public UtilityField(String name, int number, Dice dice) {
        super(name, number);
        this.dice = dice;
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (ownedBy != null) {
            
        } else {
            super.consequense(poorPlayer);
        }
    }
    
}
