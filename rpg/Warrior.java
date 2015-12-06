
public class Warrior
{

    int meleeDamage;
    int rangedDamage;
    int magicDamage;
    int armorHead;
    int armorBody;
    int armorLeg;
    
    public Warrior ()
    {
        meleeDamage = 1;
        rangedDamage = 0;
        magicDamage = 0;
        armorHead = 1;
        armorBody = 2;
        armorLeg = 1;
        
    }
    
    void setMeleeDamage (int newMeleeDamage)
    {
        meleeDamage = newMeleeDamage;
    }
    
    void setRangedDamage (int newRangedDamage)
    {
        rangedDamage = newRangedDamage;
    }
    
    void setMagicDamage (int newMagicDamage)
    {
        magicDamage = newMagicDamage;
    }
    
    void setArmorHead (int newArmorHead)
    {
        armorHead = newArmorHead;
    }
    
    void setArmorBody (int newArmorBody)
    {
        armorBody = newArmorBody;
    }
    
    void setArmorLeg (int newArmorLeg)
    {
        armorLeg = newArmorLeg;
    }
}